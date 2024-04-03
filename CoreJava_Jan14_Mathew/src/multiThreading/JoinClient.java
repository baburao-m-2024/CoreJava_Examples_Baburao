package multiThreading;

public class JoinClient {

	public static void main(String[] args) {

		System.out.println("Starting of main method");
		
		JoinDemo demoObj = new JoinDemo();
		demoObj.start();
		
		for(int i=1; i<=100; i++) {
			System.out.println("value of i in main method is "+i+" - "+Thread.currentThread().getName());
			if(i == 30) {
				try {
					demoObj.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Ending of main method");
	}

}
