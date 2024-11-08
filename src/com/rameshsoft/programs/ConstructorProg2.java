package com.rameshsoft.programs;

class ConstructorsProg2
{
	int practHrs;
	String res;
	
	public ConstructorsProg2(int practHrs, String res)
	{
		System.out.println("Parameterised Constructor");
		this.practHrs = practHrs;
		this.res = res;
	}
	
	public ConstructorsProg2()
	{
		System.out.println("Default Constructor");
	}
	
	public void hardwork() {
		System.out.println(practHrs + " = " + res);
	}
}

public class ConstructorProg2 {
	public static void main(String[] args) {
		
		ConstructorsProg2 prog = new ConstructorsProg2(9,"JOB");
		ConstructorsProg2 prog2 = new ConstructorsProg2('a' , "Job");
		prog.hardwork();
		prog2.hardwork();
		
	}
}
