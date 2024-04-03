package oops.classesAndObjects;

public class StaticDemo {

	public static void main(String[] args) {

		//Employee.gender = 'F';
		Employee.setGender('M');
		Employee.setOrganization("tcs");
		
		System.out.println(Employee.getGender());
		System.out.println(Employee.getOrganization());
		
		Employee obj = new Employee(101, "harsha", 9000);
		System.out.println(obj);
		
		Employee obj2 = new Employee();
		obj2.setId(402);
		obj2.setName("vishnu");
		obj2.setSalary(8900);
		
		System.out.println(obj2.getId());
		System.out.println(obj2.getName());
		System.out.println(obj2.getSalary());
		
		
	}

}
