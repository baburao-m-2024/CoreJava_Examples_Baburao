package multiThreading;

public class ImplementsRunnableClient {

	public static void main(String[] args) {

		System.out.println("Starting of main method");
		
		Thread.currentThread().setName("Thread-HERO");
		Thread.currentThread().setPriority(8);
		
		// STEP 2 : Create and start a new Thread through calling Thread class start method
		ImplementsRunnableDemo demoObj = new ImplementsRunnableDemo();
		
		Thread tObj = new Thread(demoObj);
		tObj.start();
		
		
		for(int i=1; i<=100; i++) {
			System.out.println("value of i in main method is "+i+" - "+Thread.currentThread().getName()+
					" " +Thread.currentThread().getPriority());
		}
		
		System.out.println("Ending of main method");
	}

}
