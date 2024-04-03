package oops.polymorphism;

public class SuperClassRefSubClassObjRules {

	public static void main(String[] args) {

		// Parent class or Super class or Base class
		// Child class or Sub class or Derived class
		
		Employee emp = new Employee(101, "harsha", 9000);
		Developer dev = new Developer(201, "harika", 8000, 30, 20);
		
		// RULE 1 : Parent class variable can be assigned with child class object
		// but child class variable cannot be assigned with parent class object
		Employee e2 = new Developer();
		//Developer d2 = new Employee();
		
		// RULE 2 : When we assign child class object to parent class variable 
		// then using parent class variable we can call only parent class methods
		// but not child class methods
		e2.setId(301);
		e2.setName("john");
		e2.setSalary(9800);
	//	e2.setNoOfIssuesAssigned(9);
		
		// RULE 3 : When we assign child class object to parent class variable 
		// and if we try to call the overridden method then 
		// the overridden logic present in child class will get executed
		
		System.out.println(e2.getBonus());
		
	}

}
