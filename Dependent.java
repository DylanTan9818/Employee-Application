public class Dependent extends Person{
	private String gender;
	private String birthdate;

	public Dependent(String name, String address, String phonenumber, String email, String gender, String birthdate) {
		super(name, address, phonenumber, email);
		this.gender = gender;
		this.birthdate = birthdate;
	}

	public String getGender() {

		return gender;
	}

	public String getBirthdate() {
		return birthdate;
	}



	@Override
	public String toString() {
		return "The Dependent " + super.getName() + " (" + getGender() + ") " + "with birthdate " + getBirthdate() + " who is staying at " + super.getAddress() + " with email address " + super.getEmail() + " and phone number " + super.getPhonenumber();
	}
}
