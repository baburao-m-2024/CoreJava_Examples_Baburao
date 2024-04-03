package multiThreading;

public class InterruptClient {

	public static void main(String[] args) {

		System.out.println("Starting of main method");
		
		InterruptDemo demoObj = new InterruptDemo();
		demoObj.start();
		
		for(int i=1; i<=100; i++) {
			System.out.println("value of i in main method is "+i+" - "+Thread.currentThread().getName());
		}
		
		demoObj.interrupt();
		System.out.println("Ending of main method");
	}

}
