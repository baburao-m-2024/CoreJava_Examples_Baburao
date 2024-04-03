package oops.inheritance;

public class InheritanceClient {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("harsha");
		emp.setGender('M');
		
		RegularEmployee regEmp = new RegularEmployee();
		regEmp.setId(201);
		regEmp.setName("john");
		regEmp.setGender('M');
		regEmp.setSalary(9000);
		regEmp.setBonus(900);
		
		System.out.println("Employee information is ---- ");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getGender());
		
		System.out.println();
		System.out.println("RegularEmployee information is ----");
		System.out.println(regEmp.getId());
		System.out.println(regEmp.getName());
		System.out.println(regEmp.getGender());
		System.out.println(regEmp.getSalary());
		System.out.println(regEmp.getBonus());
		
	}

}
