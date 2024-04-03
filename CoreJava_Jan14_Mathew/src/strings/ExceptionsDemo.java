package strings;

public class ExceptionsDemo {
	
	static String course;  // null

	public static void main(String[] args) {

		String name = "babu";
		
		System.out.println(name.charAt(0));  // b
		
	//	System.out.println(name.charAt(10));  // StringIndexOutOfBoundsException
		
		System.out.println(course.length());  // NullPointerException
		
	}

}
