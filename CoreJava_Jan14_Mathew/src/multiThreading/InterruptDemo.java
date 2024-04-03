package multiThreading;

public class InterruptDemo extends Thread {

	@Override
	public void run() {
		
		System.out.println("Starting of run method");
		
		for(int j=1; j<=100; j++) {
			System.out.println("value of j in run method is "+j+" - "+Thread.currentThread().getName());
			if(j == 20) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Ending of run method");
		
	}
	
}
