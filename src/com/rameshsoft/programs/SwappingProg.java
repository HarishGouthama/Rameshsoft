package com.rameshsoft.programs;

public class SwappingProg {
public static void main(String[] args) {
	
	int num1 = 60;
	int num2 = 61;
	
	System.out.println("Before Swapping: num1 = " +num1 + " num2 = " +num2);
	
	int extra;
	
	extra = num1;
	num1 = num2;
	num2 = extra;
	
	System.out.println("After Swapping : num1 = " + num1 + " num2 = " +num2);
}
}