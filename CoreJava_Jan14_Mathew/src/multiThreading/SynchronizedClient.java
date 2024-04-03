package multiThreading;

public class SynchronizedClient {

	public static void main(String[] args) {

		SynchronizedDemo demoObj = new SynchronizedDemo();
		
		Thread t1 = new Thread(demoObj);
		t1.start();
		
		Thread t2 = new Thread(demoObj);
		t2.start();
		
		Thread t3 = new Thread(demoObj);
		t3.start();
		
	}

}
