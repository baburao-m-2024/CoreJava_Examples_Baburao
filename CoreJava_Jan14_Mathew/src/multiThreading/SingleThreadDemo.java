package multiThreading;

public class SingleThreadDemo {
	
	public void display() {
		System.out.println("Starting of display method");
		
		for(int j=1; j<=10; j++) {
			System.out.println("value of j in display method is "+j);
		}
		
		System.out.println("Ending of display method");
	}

}
