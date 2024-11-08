package com.rameshsoft.programs;

class OverloadProg {
	int num1 = 45 , num2 = 155;
	public int addition() {
		int result = num1 + num2;
		System.out.println("Result is: " + result);
		return result;
	}
}
public class OverloadingProgram{
	public static void main(String[] args) {
		OverloadProg prog = new OverloadProg();
		prog.addition();
	}
}
