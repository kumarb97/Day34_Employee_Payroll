package employee_payroll_Main;

import java.sql.Date;

public class Employee {
	private String name;
	private int id;
	private double salary;
	private Date date;
	
	public Employee(String name, int id, double salary, Date date) {
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", date=" + date + "]";
	}

}
