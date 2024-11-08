package com.rameshsoft.programs;

public class StringsProg {
	public static void main(String[] args) {
		
		
		String str = "    Java Selenium    ";
		System.out.println(str);
		
		String str1 = str.trim();
		System.out.println(str1);
		
		String str2 = str1.toUpperCase();
		System.out.println(str2);
		
		String str3 = str2.toLowerCase();
		System.out.println(str3);
		
		char ch = str3.charAt(2);
		System.out.println(ch);
		
		char[] ch1 = str3.toCharArray();
		for(int i = 0 ; i < ch1.length ; i++)
		{
			System.out.println(ch1[i]);  
		}
		
		String str4 = str3.substring(2);
		System.out.println(str4);
		
		String str5 = str3.substring(2 , 9);
		System.out.println(str5);
		
		String str6 = str3.replace("java", "Java Job");
		System.out.println(str6);
	}
}
