
package com.rameshsoft.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExProg {
	public static void main(String[] args) {
		
		String str = "java @$@#JAVAhardworkjava456";
		
		Pattern pattern = Pattern.compile("[java]");
		
		Matcher matcher = pattern.matcher(str);
		
		int count = 0;
		
		while(matcher.find())
		{
			count++;
			String str1 = matcher.group();
			int startIndx = matcher.start();
			int endIndx = matcher.end();
			System.out.println(str1 + " = " + startIndx + " = " + endIndx);
		}
		
		System.out.println("No of occurences of a char is: " + count);		
		
	}
}
