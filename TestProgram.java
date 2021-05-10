import java.util.ArrayList;
import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {

		ArrayList<Object> employeelist = new ArrayList<>();
		System.out.println("Welcome to people information system");
		String ans = "yes";
		Scanner input = new Scanner(System.in);



		while(ans.equals("yes")){
			inputUser(input,employeelist);
			System.out.println("Do you still want to add people details");
			ans = input.nextLine();
		}
		System.out.println("******************************************** People Information *******************************************");

		for(int i = 0; i< employeelist.size(); i++){
			System.out.println(employeelist.get(i).toString());
		}
	}

	public static String determinePerson() {
		Scanner input = new Scanner(System.in);
		String figure;
		System.out.println("************************************************************************************************************");
		System.out.println("               Type of person               ");
		System.out.println("1)Employee");
		System.out.println("2)Dependent");
		System.out.print("Which person would you like to add ? ");
		figure = input.nextLine().toLowerCase();
		return figure;
	}

	public static void inputUser(Scanner input,ArrayList employeelist) {
		String figure = determinePerson();
		// declare variable
		String name, address, email, employeeNum, phoneNum, birthdate, gender;
		double basicSalary, allowance, commision, overTime;
		if(figure.equals("employee")) {
			System.out.println("1)Employee-->(Manager,SalesPerson,Secretary)");
			System.out.print("Which employee would you like to add ? ");
			String figure1 = input.nextLine().toLowerCase();
			System.out.print("Name : ");
			name = input.nextLine();
			System.out.print("Address : ");
			address = input.nextLine();
			System.out.print("Email : ");
			email = input.nextLine();
			System.out.print("Phone number : ");
			phoneNum = input.nextLine();
			System.out.print("Employee ID : ");
			employeeNum = input.nextLine();
			System.out.print("Basic Salary : ");
			basicSalary = input.nextDouble();

			if (figure1.equals("manager")) {
				System.out.print("Allowance : ");
				allowance = input.nextDouble();
				input.nextLine();
				ManagerObject(name, address, phoneNum, email, employeeNum, basicSalary, allowance, employeelist);
			} else if (figure1.equals("salesPerson")) {
				System.out.print("Commission : ");
				commision = input.nextDouble();
				input.nextLine();
				SalesPersonObject(name, address, phoneNum, email, employeeNum, basicSalary, commision, employeelist);
			} else if (figure1.equals("secretary")) {
				System.out.print("Overtime : ");
				overTime = input.nextDouble();
				input.nextLine();
				SecretaryObject(name, address, phoneNum, email, employeeNum, basicSalary, overTime, employeelist);
			}
			} else if (figure.equals("dependent")) {
				System.out.print("Name : ");
				name = input.nextLine();
				System.out.print("Address : ");
				address = input.nextLine();
				System.out.print("Email : ");
				email = input.nextLine();
				System.out.print("Phone number : ");
				phoneNum = input.nextLine();
				System.out.print("Gender: ");
				gender = input.nextLine();
				System.out.print("Birthdate : ");
				birthdate = input.nextLine();
				System.out.println("******************************************** Dependent Information *******************************************");
				Dependent dependent = new Dependent(name, address, phoneNum, email, gender, birthdate);
				System.out.println(dependent.toString() + "\n");
				employeelist.add(dependent);
			}
		}


	public static void ManagerObject(String name, String address, String phoneNum, String email, String employeeNum,
									 double basicSalary, double allowance, ArrayList employeelist) {
		Manager manager = new Manager(name, address, phoneNum, email, employeeNum, basicSalary, allowance);
		System.out.println("******************************************** Manager Information *******************************************");
		employeelist.add(manager);
		System.out.println(manager.toString() + "\n");
	}

	public static void SalesPersonObject(String name, String address, String phoneNum, String email, String employeeNum,
										 double basicSalary, double commision, ArrayList employeelist) {
		System.out.println("***************************************** Sales Person Information *****************************************");
		SalesPerson salesPerson = new SalesPerson(name, address, phoneNum, email, employeeNum, basicSalary, commision);
		employeelist.add(salesPerson);
		System.out.println(salesPerson.toString() + "\n");
	}

	public static void SecretaryObject(String name, String address, String phoneNum, String email, String employeeNum,
									   double basicSalary, double overTime,ArrayList employeelist) {
		System.out.println("***************************************** Secretary Information ********************************************");
		Secretary secretary = new Secretary(name, address, phoneNum, email, employeeNum, basicSalary, overTime);
		employeelist.add(secretary);
		System.out.println(secretary.toString() + "\n" );
	}

}