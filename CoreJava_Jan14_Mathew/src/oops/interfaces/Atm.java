package oops.interfaces;

public interface Atm {
	
	 boolean validatePin(int pinNo);
	 
	 int balanceInquiry();
	 
	 int cashWithDrawal(int requestedAmount) ;

}
