package com.rameshsoftassignments.programs;

import java.io.InputStream;
import java.util.Scanner;

public class PositiveorNegative {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = scn.nextInt();
		
		if(number > 0)
		{
			System.out.println("The Number is Positive");
		}
		
		else if(number < 0)
		{
			System.out.println("The Number is Negative");
		}
		
		else
		{
			System.out.println("The Number is Zero");
		}
	}
}
