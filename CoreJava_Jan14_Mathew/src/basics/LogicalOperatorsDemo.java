package basics;

public class LogicalOperatorsDemo {

	public static void main(String[] args) {

		displayEligibility(80, 5);
		
	}
	
	static void displayEligibility(int academicAggr, int exp) {
	
		if(academicAggr > 75 && exp > 5) {
			System.out.println("You are eligible for interview with Infosys");
		}else if(academicAggr > 75 || exp > 5) {
			System.out.println("You are eligible for interview with TCS");
		}else {
			System.out.println("You are eligible for interview with WIPRO");
		}
		
	}

}
