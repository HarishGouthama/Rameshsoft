package com.rameshsoft.programs;

class ThisSuper1
{
	int practHrs = 14;
	String res = "JOBS";
	
	public void hardwork() {
		int practHrs = 5;
		String res = "JOB";
		System.out.println(practHrs + " = " + res);
		System.out.println(this.practHrs + " = " + this.res);
	}
}

class ThisSuper2 extends ThisSuper1
{
	int practHrs = 2;
	String res = "JOBSSS";
	
	
	public void hardwork() {
		int practHrs = 3;
		String res = "JOB";
		System.out.println(practHrs + " = " + res);
		System.out.println(this.practHrs + " = " + this.res);
		System.out.println(super.practHrs + " = " + super.res);
		super.hardwork();
	}
}

public class ThisSuperProg {
	public static void main(String[] args) {
		
		
		ThisSuper2 prog = new ThisSuper2();
	
		prog.hardwork();
		
		
	}
}
