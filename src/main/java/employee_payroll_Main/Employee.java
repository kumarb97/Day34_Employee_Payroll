package employee_payroll_Main;

public class Employee {
	private String name;
	private int id;
	private double salary;
	private String date;
	
	public Employee(String name, int id, double salary, String date) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", date=" + date + "]";
	}

}
