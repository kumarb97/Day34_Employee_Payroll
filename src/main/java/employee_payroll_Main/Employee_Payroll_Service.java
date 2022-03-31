/*
 * UC1 : Ability to create a payroll service database and have java program
 *       connect to database.
 */
package employee_payroll_Main;

public class Employee_Payroll_Service {
	
	/*
	 * Main method
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Employee payroll service");
		ConnectionProvider.setConnection();

	}

}
