package com.rameshsoft.programs;

class ConstructorsProg
{
	public ConstructorsProg()

	{
		System.out.println("Default COnstructor");
	}
	
	public ConstructorsProg getObj()
	{
		ConstructorsProg prog = new ConstructorsProg();
		return prog;
	}
	
	public void hardwork() {
		System.out.println("Hardwork = Job");
	}
}

public class ConstructorProg {
	public static void main(String[] args) {
		
		ConstructorsProg prog = new ConstructorsProg();
		prog.hardwork();
		
		
	}
}
