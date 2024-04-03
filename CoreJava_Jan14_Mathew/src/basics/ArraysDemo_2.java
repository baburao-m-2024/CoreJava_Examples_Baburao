package basics;

public class ArraysDemo_2 {

	public static void main(String[] args) {

		String[] courses = new String[5];  // valid index positions : 0,1,2,3,4
		
		courses[0] = "html";
		courses[1] = "css";
	//	courses[2] = 80;
		courses[3] = "ts";
	//	courses[4] = "angular";
	//	courses[5] = "java";
		
		/*for(int i=0; i<courses.length; i++) {
			System.out.println(courses[i]);
		}*/
		
		for(String temp : courses) {
			System.out.println(temp);
		}
		
	}

}
