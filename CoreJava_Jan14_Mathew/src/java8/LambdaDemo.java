package java8;

public class LambdaDemo {

	public static void main(String[] args) {

		Atm obj = (pinNo) -> {
			System.out.println("input received are "+pinNo);
			return true;
		};
		
		obj.validatePin(9090);
		obj.balanceInquiry();
		
		Atm.cashWithDrawal(9000);
		
		Atm obj2 = (pinNo) -> {
			System.out.println("input received are "+pinNo);
			return false;
		};
		
	}

}
