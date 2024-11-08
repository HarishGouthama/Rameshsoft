package com.rameshsoft.programs;
class ReadOnlyProg{
	int practHrs = 9;
	String res = "JOB";
	
	public void hardwork() {
		System.out.println(practHrs + " = " + res);
	}
}
public class ReadOnlyTest {
	public static void main(String[] args) {
		ReadOnlyProg prog = new ReadOnlyProg();
		prog.hardwork();
		
		
		prog.practHrs = 0;
		prog.res	  = "No Job";
		prog.hardwork();
	}

}
