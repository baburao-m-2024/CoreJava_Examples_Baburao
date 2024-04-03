package oops.interfaces;

public abstract class Sbi implements Atm {

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
	public abstract int cashWithDrawal(int requestedAmount) ;

	

}
