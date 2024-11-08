package com.rameshsoft.programs;

public class BalWithDraw {
	public static void main(String[] args) throws InSufficientFundsException {
		
		double savingsAmount = 25000;
		
		int withDrawAmount = 55000;
		
		if(savingsAmount > withDrawAmount)
		{
			System.out.println("Withdraw");
		}
		
		else
		{
			InSufficientFundsException exception = new InSufficientFundsException("You dont have sufficient funds : " + savingsAmount + " Your withdrawing amount: " + withDrawAmount);
			throw exception;
		}
	}
}
