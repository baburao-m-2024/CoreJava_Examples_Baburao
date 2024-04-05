package basics;

public class IfElseDemo {

	public static void main(String[] args) {

		System.out.println("Starting of main method");
		int id = 90;		
		
		displayDesignation(60);
		
		System.out.println("Ending of main method");
	}
	
	static void displayDesignation(int experience) {
		
		if(experience <= 4) {
			System.out.println("I am working as Jr. Level Software Engineer");
			System.out.println("I am new to programming");
		}else if(experience <= 8) {
			System.out.println("I am working as Software Engineer");
		}else if(experience <= 12) {
			System.out.println("I am working as Sr. Level Software Engineer");
		}else {
			System.out.println("I am working as Manager");
		}
		
	}

}
