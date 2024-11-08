package com.rameshsoft.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitsSumProg {
	public static void main(String[] args) {
		
		String str = "adp456";
		
		int sum = 0;
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			boolean dgt = Character.isDigit(ch);
			if(dgt) {
				int val = Character.getNumericValue(ch);
				sum = sum + val;
			}
		}
		
		System.out.println("Sum is: " + sum);		
		
		/*Pattern pattern = Pattern.compile("[0-9]");
		
		Matcher matcher = pattern.matcher(str);
		
		int sum = 0;
		
		while(matcher.find())
		{
			String str1 = matcher.group(); // "4" "5" "6"
			System.out.println(str1);
			int val = Integer.parseInt(str1);
			sum = sum +val;
		}
		
		System.out.println("SUM is: " + sum);*/
		
		
		
	}
}
