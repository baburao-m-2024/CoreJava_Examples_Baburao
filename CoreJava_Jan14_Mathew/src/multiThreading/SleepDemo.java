package multiThreading;

public class SleepDemo {

	public static void main(String[] args) {

		System.out.println("starting of main method");
		
		for(int i=1; i<=10; i++) {
			System.out.println("value of i in main method is "+i+" - "+Thread.currentThread().getName()+" - "+Thread.currentThread().getPriority());
			if(i==2) {
				try {
					Thread.sleep(1000 * 6);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("ending of main method");
		
	}

}
