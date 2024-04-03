package basics;

public class LocalAndGlobalDemo {
	
	static double amount = 90.454;

	public static void main(String[] args) {

		String course = "java";
		System.out.println("value of course in main method is "+course);
		
		 display(101, "harsha");
		 
		 System.out.println("value of amount in main method is "+amount);
		
	}
	
	static void display(int rollNo, String name) {
		
		//System.out.println("value of course in display method is "+course);
		System.out.println("My rollNo is "+rollNo);
		System.out.println("My name is "+name);
		
		System.out.println("value of amount in display method is "+amount);
		
	}

}
