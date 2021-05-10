public class Manager extends Employee {
	private double allowance;

	public Manager(String name, String address, String phonenumber, String email, String employeenum, double salary, double allowance) {
		super(name, address, phonenumber, email, employeenum, salary);
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	@Override
	public String toString() {
		
		return "The Manager " + super.getName() + " who is staying at " + super.getAddress() + " with email address " + super.getEmail() + " and phone number " + super.getPhonenumber() + " (employee number " + super.getEmployeenum() +") has total salary of RM" +String.format("%.2f", (super.getSalary() + getAllowance())) ;
	}

	
	
	
	
	
}
