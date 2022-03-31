/*
 * UC3 : Ability to update employee salary by using name;
 *       
 */
package employee_payroll_Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee_Payroll_Service {
	/*
	 * Main method
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("___________________________________");
		System.out.println("Welcome to Employee payroll service");
		System.out.println("___________________________________");
		while(true) {
			System.out.println("Enter 1 to display Employee's data");
			System.out.println("Enter 2 to Update Emloyee's data");
			int c= Integer.parseInt(br.readLine());
			switch(c) {
			case 1:
				Employee_Payroll_Service.displayEmployee();
			case 2:
				Employee_Payroll_Service.updateEmployee();
			}
		}

	}
	/*
	 * Method to update employee salary using name.
	 */
	public static void updateEmployee() {
		try {
			Connection con = ConnectionProvider.setConnection();
			String query = "UPDATE employee_payroll SET Salary =30000.0 WHERE name ='Smriti'";
			PreparedStatement pstmt = con.prepareCall(query);
			pstmt.executeUpdate();
			System.out.println("Updated Successfully");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	/*
	 * dislplayEmployee Method is used to retrieve all employee
	 * data from database
	 */
	private static void displayEmployee() {
		try {
		Connection con = ConnectionProvider.setConnection();
		String query = "select * from employee_payroll";
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery(query);
		while(set.next()) {
			int id = set.getInt(1);
			String name = set.getString(2);
			Double salary = set.getDouble(3);
			Date date = set.getDate(4);
			System.out.println("________________________");
			System.out.println("ID : " +id);
			System.out.println("Name : " +name);
			System.out.println("Salary : " +salary);
			System.out.println("Date : " +date);
			System.out.println("________________________");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
