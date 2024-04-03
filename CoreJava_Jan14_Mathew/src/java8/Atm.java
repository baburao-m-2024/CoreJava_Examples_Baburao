package java8;

@FunctionalInterface
public interface Atm {
	
	boolean validatePin(int pinNo);
	
	default int balanceInquiry(){
		return 9000;
	}
	
	static void cashWithDrawal(int requestedAmount) {
		
	}

}
