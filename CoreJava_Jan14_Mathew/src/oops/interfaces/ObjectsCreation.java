package oops.interfaces;

public class ObjectsCreation {

	public static void main(String[] args) {

		Icici obj1 = new Icici();
		
		//Card obj2 = new Card();
		
		// Rbi obj2 = new Rbi();
		
		Rbi obj3 = new Axis();
		
		obj3.getFDLoanInterest(3434);
		obj3.getPLoanInterest(3434);
		
	}

}
