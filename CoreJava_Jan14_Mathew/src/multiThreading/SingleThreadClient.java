package multiThreading;

public class SingleThreadClient {

	public static void main(String[] args) {

		System.out.println("Starting of main method");
		
		SingleThreadDemo obj = new SingleThreadDemo();
		obj.display();
		
		for(int i=1; i<=10; i++) {
			System.out.println("value of i in main method is "+i);
		}
		
		System.out.println("Ending of main method");
	}

}
