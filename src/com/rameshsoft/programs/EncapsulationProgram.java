package com.rameshsoft.programs;

class EncapsulationProgram
{
	 private int practHrs = 9;
	 private String res = "JOB";
	
	public int getPractHrs() {
		return practHrs;
	}
	
	public String getRes() {
		return res;
	}
	
	public void display()
	{
		System.out.println(practHrs + " = " + res);
	}
	public static class EncapsulationProg{
		public static void main(String[] args) {
		EncapsulationProgram Prog = new EncapsulationProgram();
		/*Prog.practHrs = 0;
		Prog.res = "NO JOB";
		
		System.out.println(Prog.practHrs);
		System.out.println(Prog.res);*/
		Prog.display();
	}
}
}