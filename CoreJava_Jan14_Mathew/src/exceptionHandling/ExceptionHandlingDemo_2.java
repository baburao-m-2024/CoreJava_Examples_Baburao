package exceptionHandling;

public class ExceptionHandlingDemo_2 {

	public static void main(String[] args) {

		System.out.println("starting of main method");
		
		String course = "java";
		
		try {
			System.out.println(course.charAt(10));
		}catch(StringIndexOutOfBoundsException ex) {
			System.out.println("please check the index position");
		}
		
		System.out.println("ending of main method");
	}

}
