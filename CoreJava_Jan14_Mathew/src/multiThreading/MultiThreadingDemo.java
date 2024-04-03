package multiThreading;

// STEP 1 : Make the class as eligible for multiThreading through extends Thread class
public class MultiThreadingDemo extends Thread {
	
	void display() {
		System.out.println("starting of display method "+Thread.currentThread().getName());
		
		for(int j=1; j<=100; j++) {
			System.out.println("value of j in display method is "+j+" - "+Thread.currentThread().getName());
		}
		
		System.out.println("ending of display method "+Thread.currentThread().getName());
	}
	
	// STEP 3: Define the starting point for the newly created Thread execution process -- run
	@Override
	public void run() {

		System.out.println("starting of run method "+Thread.currentThread().getName());
	
		display();
		
		System.out.println("ending of run method "+Thread.currentThread().getName());
	}
	
	

}
