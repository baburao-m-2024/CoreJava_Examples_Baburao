package exceptionHandling;

public class ExceptionHandlingAnalysis {

	public static void main(String[] args) {

		System.out.println("Start of main");
		
		//System.out.println(10/0);
		
		try {
			System.out.println("start of try");
			System.out.println(20/0);
		}catch(ArithmeticException ex) {
			System.out.println("dont divide by 0");
		}
		
		System.out.println("end of main");
	}

}
