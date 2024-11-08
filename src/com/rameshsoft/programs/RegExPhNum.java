package com.rameshsoft.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPhNum {
	public static void main(String[] args) {
		
		String phNum = "+918177791456";
		
		Pattern pattern = Pattern.compile("(0|[+]?91)?[6-9][0-9]{9}");
		
		Matcher matcher = pattern.matcher(phNum);
		
		if(matcher.find()&&matcher.group().equalsIgnoreCase(phNum)) {
			System.out.println("Valid phone number");
		}
		else
		{
			System.out.println("Invalid phone number");
		}
		
	}
}
