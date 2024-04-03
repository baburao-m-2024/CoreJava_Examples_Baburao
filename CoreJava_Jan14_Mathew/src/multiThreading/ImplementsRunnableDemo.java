package multiThreading;

import oops.classesAndObjects.Employee;

// STEP 1 : Make the class as eligible for multiThreading through implements Runnable
public class ImplementsRunnableDemo extends Employee implements Runnable {
	
	// STEP 3 : Define the starting point for the newly created Thread execution process
	@Override
	public void run() {

		System.out.println("Starting of run ");
		
		Thread.currentThread().setName("Thread-ZERO");
		Thread.currentThread().setPriority(3);
		
		display();
		
		System.out.println("ending of run");
	}
	
	void display() {
		System.out.println("Starting of display method");
		
		for(int j=1; j<=100; j++) {
			System.out.println("value of j in display method is "+j+" - "+Thread.currentThread().getName() +
					" " +Thread.currentThread().getPriority());
		}
		
		System.out.println("Ending of display method");
	}

}
