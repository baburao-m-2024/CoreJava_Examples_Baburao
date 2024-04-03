package oops.interfaces;

public abstract class Rbi  implements Card {

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
	public abstract double getHLoanInterest(int amount);

}
