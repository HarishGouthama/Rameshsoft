package com.rameshsoft.programs;

public class ObjectArraysProg {
	public static void main(String[] args) {
		
		Object[] obj = new Object[5];
		
		obj[0] = 456;
		obj[1] = "Java";
		obj[2] = "Job";
		obj[3] = 456.456;
		obj[4] = "hardwork";
		
		for(int i = 0 ; i < obj.length ; i++)
		{
			System.out.println(obj[i]);
		}
		
	}
}
