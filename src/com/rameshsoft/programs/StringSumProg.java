package com.rameshsoft.programs;

public class StringSumProg {
	public static void main(String[] args) {
		
		String str = "java456";
		
		int sum = 0;
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			boolean b = Character.isDigit(ch);
			if(b)
			{
				int val = Character.getNumericValue(str.charAt(i));
				sum = sum + val;
			}
		}
		
		System.out.println("Sum is : " + sum);
		
	}
}
