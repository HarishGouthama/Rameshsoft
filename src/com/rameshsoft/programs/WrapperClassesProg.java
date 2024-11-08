package com.rameshsoft.programs;

public class WrapperClassesProg {
	public static void main(String[] args) {
		
		int i = 465;
		
		Integer i1 = 91456;
		//Integer i2 = new Integer(56);
		
		String str = "456";
		
		int val = Integer.parseInt(str);
		System.out.println(val);
		
		String str1 = "456.456";
		double d = Double.parseDouble(str1);
		System.out.println(d);
		
		Integer i2 = Integer.valueOf(i);
		System.out.println(i2);
		
		Integer i3 = Integer.valueOf(str);
		System.out.println(i3);
		
		
	}
}
