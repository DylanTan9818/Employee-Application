public class Secretary extends Employee {
	private double overtime;

	public Secretary(String name, String address, String phonenumber, String email, String employeenum, double salary, double overtime) {
		super(name, address, phonenumber, email, employeenum, salary);
		this.overtime = overtime;
	}

	public double getOvertime() {
		return overtime;
	}

	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The Secretary " + super.getName() + " who is staying at " + super.getAddress() + " with email address " + super.getEmail() + " and phone number " + super.getPhonenumber() + " (employee number " + super.getEmployeenum() +") has salary of RM" + String.format("%.2f", (super.getSalary() +  getOvertime()));
	}
	
}
