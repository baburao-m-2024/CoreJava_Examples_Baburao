package multiThreading;

public class MultiThreadingClient {
	
	static void m1() {
		
	}

	public static void main(String[] args) {

		System.out.println("Starting of main method - "+Thread.currentThread().getName());
		
		// STEP 2 : Create and start a new Thread through calling Thread class start method
		MultiThreadingDemo demoObj = new MultiThreadingDemo();
		demoObj.start();
		
		for(int i=1; i<=100; i++) {
			System.out.println("value of i in main method is "+i+" - "+Thread.currentThread().getName());
		}
		
		System.out.println("Ending of main method - "+Thread.currentThread().getName());
		
	}

	void m2() {
		
	}
	
}
