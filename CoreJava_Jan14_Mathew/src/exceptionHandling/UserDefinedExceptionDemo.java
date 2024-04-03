package exceptionHandling;

import java.util.Scanner;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {

		int availableBalance = 1000;
		
		Scanner scObj = new Scanner(System.in);
		System.out.println("Please enter amount to withdraw");
		int requestedAmount = scObj.nextInt();
		scObj.close();
		
		if(requestedAmount > availableBalance) {
			throw new InSufficientBalanceException("please check the balance");
		}
		availableBalance = availableBalance - requestedAmount;
		System.out.println("balance left out is "+availableBalance);
		
	
		
	}

}
