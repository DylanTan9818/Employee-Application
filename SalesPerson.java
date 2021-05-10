public class SalesPerson extends Employee {
	private double commission;

	public SalesPerson(String name, String address, String phonenumber, String email, String employeenum, double salary, double commission) {
		super(name, address, phonenumber, email, employeenum, salary);
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The Sales Person " + super.getName() + " who is staying at " + super.getAddress() + " with email address " + super.getEmail() + " and phone number " + super.getPhonenumber() + " (employee number " + super.getEmployeenum() +") has salary of RM" + String.format("%.2f", (super.getSalary() + getCommission())) ;
	}
	
	
}
