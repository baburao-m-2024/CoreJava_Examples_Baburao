package basics;

public class DisplayVariablesDemo {

	public static void main(String[] args) {

		int rollNo = 90;  // create a new variable
		rollNo = 80;  // updating the value of existing variable
		rollNo = 40;
		
	//	double rollNo = 8.5;
		
		System.out.println(rollNo);  // 40
		System.out.println("rollNo");  // rollNo
		
		System.out.println("value of rollNo is "+ rollNo);
		
		String course = "java";
		
		System.out.println("My rollNo is "+rollNo+" and i am learning "+course);
		
	}

}
