package com.rameshsoft.programs;


class Outer
{
	public void hardwork()
	{
		System.out.println("Job = Hardwork");
	}
	
	public static void job()
	{
		System.out.println("Practice = Job");
	}
	
	static class Inner
	{
		public void hardwork1()
		{
			System.out.println("SIC:Job = Hardwork");
		}
		public static void job1()
		{
			System.out.println("SIC:Practice = Job");
		}
	}
	
	class Inner1
	{
		public void hardwork1()
		{
			System.out.println("NSIC:Job = Hardwork");
		}
		
}
public class InnerClasses {
	public static void main(String[] args) {
		Outer outer = new Outer();
		/*outer.hardwork();
		//outer.job();
		Outer.job();
		
		Outer.Inner.job1();
		
		Outer.Inner inner = new Outer.Inner();
		inner.hardwork1();*/
		
		Outer.Inner1 inner1 = outer. new Inner1();
		inner1.hardwork1();
	}
}
}
