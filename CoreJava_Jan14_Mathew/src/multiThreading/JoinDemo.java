package multiThreading;

public class JoinDemo extends Thread {
	
	
	@Override
	public void run() {
		
		System.out.println("Starting of run method");
		
		for(int j=1; j<=100; j++) {
			System.out.println("value of j in run method is "+j);
		}
		
		System.out.println("Ending of run method");
		
	}
	

}
