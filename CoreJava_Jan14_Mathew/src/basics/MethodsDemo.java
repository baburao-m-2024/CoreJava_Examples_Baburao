package basics;

public class MethodsDemo {

	static int multiplication(int num1, int num2) {

		System.out.println("input received are " + num1 + " and " + num2);
		int result = num1 * num2;

		return result;

	}

	public static void main(String[] args) {

		System.out.println("Starting of main method");

		int r1 = multiplication(20, 5);
		System.out.println("result of multiplication is " + r1);

		System.out.println("Ending of main method");
	}

}
