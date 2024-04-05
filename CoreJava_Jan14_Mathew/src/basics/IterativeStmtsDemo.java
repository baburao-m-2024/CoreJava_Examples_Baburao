package basics;

public class IterativeStmtsDemo {

	public static void main(String[] args) {
		int id = 90;

		for(int i=1; i<=5; i++) {
			System.out.println("hi hello "+i);
		}
		
		System.out.println();
		
		int j=1;
		while(j<=5) {
			System.out.println("value of j in while loop is "+j);
			j++;
		}
		
		System.out.println();
		
		int k=1;
		do {
			System.out.println("value of k in do while loop is "+k);
			k++;
		}while(k<=5);
		
	}

}
