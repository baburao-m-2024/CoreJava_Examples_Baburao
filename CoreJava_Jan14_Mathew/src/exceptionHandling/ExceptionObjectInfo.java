package exceptionHandling;

public class ExceptionObjectInfo {

	public static void main(String[] args) {

		System.out.println("starting of main method");
		
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
		   e.printStackTrace();
		}
		
		System.out.println("ending of main method");
	}
	
/*	int x;
	Employee e;
	ArithmeticException e*/

}
