package com.rameshsoft.programs;


class OverloadProg2{
	public int addition(int num1 , int num2) {
		int result = num1 + num2;
		System.out.println("int int result: " + result);
		return result;
	}
	public float addition(float num1 , float num2) {
		float result = num1 + num2;
		System.out.println("float float result: " + result);
		return result;
	}
	public double addition(double num1 , double num2) {
		double result = num1 + num2;
		System.out.println("double double result: " + result);
		return result;
	}
	public long addition(long num1 , long num2) {
		long result = num1 + num2;
		System.out.println("long long result: " + result);
		return result;
	}
}
public class OverloadingProg2 {
	public static void main(String[] args) {
		OverloadProg2 Prog = new OverloadProg2();
		Prog.addition(455,460);
		Prog.addition('a' , 'b');
		Prog.addition(250.50f , 350.50f);
		Prog.addition(450l , 550l);
		Prog.addition(550.50,2500.50);
	}
}
