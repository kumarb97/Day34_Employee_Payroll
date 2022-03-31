package employee_payroll;
import org.junit.*;
import employee_payroll_Main.ConnectionProvider;
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

}
