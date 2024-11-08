package com.rameshsoft.programs;

class ObjectProg
{
	int practHrs = 2 ;
	String res = "Job";
	
	public void hardwork()
	{
		System.out.println(practHrs + " = " + res);
	}
}

public class ObjectInitProg {
	public static void main(String[] args) {
		
		ObjectProg prog = new ObjectProg();
		prog.practHrs = 1;
		prog.res = "JOB";
		prog.hardwork();
		
		
		ObjectProg prog1 = new ObjectProg();
		prog1.practHrs = 2 ;
		prog1.res = "Subject";
		prog1.hardwork();
	}
}
