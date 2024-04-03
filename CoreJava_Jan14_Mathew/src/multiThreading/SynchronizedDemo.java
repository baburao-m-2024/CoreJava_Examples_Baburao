package multiThreading;

public class SynchronizedDemo implements Runnable {

	@Override
	public synchronized void run() {  // 1 object level lock on each object

		for(int j=1; j<=100; j++) {
			System.out.println("value of j in run method is "+j+" - "+Thread.currentThread().getName());
		}
	}
	
	public static synchronized void m1() {  // class level lock  -- only 1 class level lock
		
	}
	
	public static void m2() {
		
	}
	
	public void m3() {
		
	}
	
}
