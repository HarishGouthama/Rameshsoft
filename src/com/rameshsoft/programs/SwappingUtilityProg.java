package com.rameshsoft.programs;

public class SwappingUtilityProg {
	
	public static void swapping(int num1 , int num2) {
		System.out.println("Before Swapping: num1= " +num1 + " num2 =" + num2);
		int extra;
		extra = num1;
		num1 = num2;
		num2 = extra;
		System.out.println("After Swapping : num1 =" +num1+ " num2 =" +num2);
		System.out.println("                                                      ");
	}
public static void main(String[] args) {
	swapping(5,10);
	swapping(500,1000);
	swapping(600,1000);
	swapping(1000000,6000000);
	swapping(300000,9999990);
}
}
