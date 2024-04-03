package strings;

public class ImmutableDemo {

	public static void main(String[] args) {

		String course1 = "java";
		String course2 = "java";
		String course3 = "java";
		
		System.out.println(course1 == course2);
		System.out.println(course2 == course3);
		System.out.println(course3 == course1);
		
		System.out.println();
		System.out.println("after update");
		course3 = "spring";
		System.out.println(course1 == course2);
		System.out.println(course2 == course3);
		System.out.println(course3 == course1);
		
		
		
		
	}

}
