package basics;

public class TerinaryOperator {

	public static void main(String[] args) {

		displayDesignation(4);
		
		System.out.println();
		
		display_2(7);
		
	}
	
	static void displayDesignation(int exp) {
		
		// (condition) ? "  " : "  "
		
		String result = (exp <= 3) ? "Jr. Level Software Engineer" : "Software Engineer";
		
		System.out.println(result);
	}
	
	static void display_2(int exp) {
		
		String result =  (exp <= 3) ? "Jr. Level Software Engineer" 
						: (exp <= 7) ? "Software Engineer"
						: (exp <= 9) ? "Sr. Level Software Engineer"
						: "Manager";
		System.out.println(result);
	}

}
