package basics;

import textFiles.Test;

public class TestClient {

	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 40;
		
		Test obj = new Test();
		int result = obj.addition(num1, num2);
		
		System.out.println(result);
		
	}

}
