package com.rameshsoft.programs;

class ThisSuperCons1
{
	public ThisSuperCons1()
	{
		super();
		System.out.println("PC : DC");
	}
}
class ThisSuperCons extends ThisSuperCons1
{
	public ThisSuperCons()
	{
		this(9);
		System.out.println("CC : DC");
	}
	
	public ThisSuperCons(int practHrs)
	{
		System.out.println("CC : 1 int Cons");
	}
}

public class ThisSuperConsProg {
	public static void main(String[] args) {
		
		ThisSuperCons ts = new ThisSuperCons();
	}
}
