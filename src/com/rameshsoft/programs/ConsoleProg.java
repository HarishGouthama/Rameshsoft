package com.rameshsoft.programs;

import java.util.Scanner;

class ConsoleProgOne
{
	int practHrs;
	String res;
	
	public void hardwork()
	{
		System.out.println(practHrs + " = " + res);
	}
}

public class ConsoleProg {
	public static void main(String[] args) {
		ConsoleProgOne prog = new ConsoleProgOne();
		System.out.println("Enter your practice Hrs");
		
		Scanner scanner = new Scanner(System.in);
		int hrs = scanner.nextInt();
		System.out.println(hrs);
		prog.practHrs = hrs;
		
		System.out.println("Enter the result");
		String result = scanner.next();
		System.out.println(result);
		prog.res = result;
		scanner.close();
		
		
	}

}
