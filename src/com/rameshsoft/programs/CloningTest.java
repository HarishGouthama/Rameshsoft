package com.rameshsoft.programs;


public class CloningTest implements Cloneable
{
	int practHrs;
	String res;
	
	public void hardwork() {
		System.out.println(practHrs + "  =   "  + res);

	}

	public static void main(String[] args) throws CloneNotSupportedException{
		
		CloningTest prog = new CloningTest();
		Object object = prog.clone();
		
		CloningTest dup = (CloningTest) object;
		
		dup.practHrs = 9;
		dup.res 	 = "JOB";
		dup.hardwork();
		
		prog.hardwork();
		
		System.out.println(prog.hashCode());
		System.out.println(dup.hashCode());
		
		
	}
}
