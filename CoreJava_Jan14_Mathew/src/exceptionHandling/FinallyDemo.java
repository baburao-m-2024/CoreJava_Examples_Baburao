package exceptionHandling;

public class FinallyDemo {

	public static void main(String[] args) {

		System.out.println("Starting of main method");
		
		try {
			System.out.println(10/2);
		}catch(ArithmeticException ex) {
			System.out.println("dont divide with 0");
		}finally {
			System.out.println("some imp stmts here");
		}
		
		System.out.println("Ending of main method");
	}

}
