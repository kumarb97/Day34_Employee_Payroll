package employee_payroll;

import org.junit.*;
import employee_payroll_Main.*;

public class employee_payroll_Test {
	
	@Test
	public void returnTrue_whenConnectionIsEstablished() {
	boolean expected = true;
	boolean result;
	try {
		ConnectionProvider.setConnection();
		result = true;
	}
	catch(Exception e) {
		result = false;
	}
	Assert.assertEquals(expected, result);
	}
	
	@Test
	public void returnTrue_whenUpdateIsDone() {
	boolean expected = true;
	boolean result;
	try {
		Employee_Payroll_Service.updateEmployee();
		result = true;
	}
	catch(Exception e) {
		result = false;
	}
	Assert.assertEquals(expected, result);
	}

}
