public class Employee extends Person {
	private String employeenum;
	private double salary;

	public Employee(String name, String address, String phonenumber, String email, String employeenum, double salary) {
		super(name, address, phonenumber, email);
		this.employeenum = employeenum;
		this.salary = salary;
	}

	public String getEmployeenum() {
		return employeenum;
	}

	public double getSalary() {
		return salary;
	}

	public void setEmployeenum(String employeenum) {
		this.employeenum = employeenum;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
