package exceptionHandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		System.out.println("Starting of main method");
		
		try {
			System.out.println(10/0);
			System.out.println("hi hello");
		}catch(ArithmeticException ex) {  // alternate solution only when exception occurs in try block
			System.out.println("Please dont divide any number by 0");
		}
		
		System.out.println("Ending of main method");
	}

}
