package oops.inheritance;

public class SuperClient {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "harsha", 'M');
		
		RegularEmployee regEmp = new RegularEmployee(102, "harika", 'F', 9000, 900);
		
		ContractEmployee contEmp = new ContractEmployee(103, "vishnu", 'M', 500, 90);
		
		System.out.println(emp);
		System.out.println(regEmp);
		System.out.println(contEmp);
		
	}

}
