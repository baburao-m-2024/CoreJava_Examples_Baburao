package basics;

public class PreAndPostDemo {

	public static void main(String[] args) {

		int num1 = 10;
		
		System.out.println(num1++);  // 10    // 10+1 = 11
		
		System.out.println(num1);
		
		int num2 = 5;
		
		System.out.println(--num2);  // 5-1 = 4   // 4
		System.out.println(num2);
		
		for(int i=1; i<10; ++i) {
			System.out.println(i);
		}
		
	}

}
