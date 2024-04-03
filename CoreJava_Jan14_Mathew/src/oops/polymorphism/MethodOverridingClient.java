package oops.polymorphism;

public class MethodOverridingClient {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "harsha", 9000);
		
		Developer dev = new Developer(201, "harika", 8000, 10, 5);
		
		System.out.println("bonus generated for employee is "+emp.getBonus());
		
		System.out.println("bonus generated for developer is "+dev.getBonus());
		
	}

}
