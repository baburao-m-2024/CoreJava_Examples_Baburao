package basics;

public class MethodsDemo_2 {

	public static void main(String[] args) {

		System.out.println("Starting of main method");
		
		double r1 = division(5, 2);
		System.out.println("result of division operation is "+r1);
		
		double r2 = division(50, 3);
		System.out.println("result of division operation is "+r2);
		
		System.out.println("Ending of main method");
		
	}
	
	static double division(int num1, int num2){
		
		System.out.println("input received are "+num1+" and "+num2);
		double result = (double) num1/num2;
		return result;
		
	}

}
