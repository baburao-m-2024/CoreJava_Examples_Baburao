package exceptionHandling;

public class TryWithMultipleCatch {

	public static void main(String[] args) {

		int[] marks = new int[4];
		String course = "java";
		
		try {
			System.out.println("start of try");
			System.out.println(marks[0]);
			System.out.println("mid of try");
			System.out.println(course.charAt(20));
		}catch(StringIndexOutOfBoundsException ex) {
			System.out.println("please check the index position of string");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("please check the index position of array");
		}catch(Exception ex) {  // Exception ex = new ArrayIndexOutOfBoundsException();
			System.out.println("some exception occured in try");
		}
	
		
		System.out.println("end of main method");
	}

}
