package employee_payroll_Main;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	static Connection con;
	/*
	 * Method to set connection
	 */
	public static Connection setConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/payroll_service";
			String user = "root";
			String password = "Smartman@97";
			con = DriverManager.getConnection(url, user, password);	
			System.out.println("Connection established successfully");
		    }
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
