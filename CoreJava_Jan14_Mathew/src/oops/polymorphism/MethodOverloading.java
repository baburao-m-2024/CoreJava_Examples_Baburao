package oops.polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {

		int id = 90;
		//double id = 9.5;
		
		MethodOverloading obj = new MethodOverloading();
		obj.addition(90,  30);
		
		obj.addition(2, 3, 4);
		
	}
	
	int addition(int num1, int num2) {
		System.out.println("input recieved to addition are "+num1+" and "+num2);
		int result = num1 + num2;
		return result;
	}
	
	int addition(int num1, int num2, int num3){
		System.out.println("input received to addition are "+num1+", "+num2+" and "+num3);
		int result = num1 + num2 + num3;
		return result;
	}
	/*
	void addition(int x, int y){
		System.out.println(x+y);
	}*/

}
