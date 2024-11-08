package com.rameshsoft.programs;

import java.util.Arrays;

public class ArraysUtilityProg {
	public static void main(String[] args) {
		
		
		String[] str = {"Java" , "Selenium" , "abc" , "Hardwork" , "Practice" , "Job"};
		
		for(int i = 0 ; i < str.length ; i++)
		{
			System.out.println(str[i]);
		}
		
		System.out.println("*********************************");
		
		Arrays.sort(str);
		
		for(int i = 0 ; i < str.length ; i++)
		{
			System.out.println(str[i]);
		}
		
		int num = Arrays.binarySearch(str ,  "Hardwork456");
		
		System.out.println(num);
		
		if(num>=0)
		{
			System.out.println("Key | value is there");
		}
		
		else
		{
			System.out.println("Key | value is not there");
		}
	}
}
