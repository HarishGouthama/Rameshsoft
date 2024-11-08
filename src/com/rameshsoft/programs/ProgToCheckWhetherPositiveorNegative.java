package com.rameshsoft.programs;

public class ProgToCheckWhetherPositiveorNegative {
	public static void main(String[] args) {
		int number = -956;
		
		if(number < 0)
		{
			System.out.println("Negative Number: " + number);
		}
		
		else if(number > 0)
		{
			System.out.println("Positive Number : " + number);
		}
		else {
			System.out.println("The Number is zero: " + number);
		}
	}
}
