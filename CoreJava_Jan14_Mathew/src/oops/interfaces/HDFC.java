package oops.interfaces;

public class HDFC implements Atm, Card {

	@Override
	public double getPLoanInterest(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getFDLoanInterest(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getHLoanInterest(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean validatePin(int pinNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int balanceInquiry() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int cashWithDrawal(int requestedAmount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
