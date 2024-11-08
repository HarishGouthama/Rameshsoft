package com.rameshsoft.programs;

abstract class Hardwork1
{
	public void job()
	{
		System.out.println("JOB");
	}
	
	public void hardwork()
	{
		System.out.println("Hardwork = Job");
	}
	
	abstract public double sal();
	abstract public String companyName();
}

 abstract class Hardwork2 extends Hardwork1
{
	 @Override
	public double sal()
	{
		double d = 145000.55;
		return d;
	}
	 
	 @Override
	 public String companyName()
	 {
		 String Name = "IBM";
		 System.out.println("Company Name is : " + Name);
		 return Name;
	 }
	 public void friends()
	 {
		 System.out.println("Office Friends");
	 }
}

public class AbstractTest extends Hardwork2{
	@Override
	public String companyName() {
		String Name = "IBM";
		System.out.println("Company Name is: " + Name);
		return Name;
				
	}
	public void techPractice()
	{
		System.out.println("Subject First , Job Next");
	}
	public static void main(String[] args) {
		//Hardwork1 work1 = new Hardwork1();
		//Hardwork2 work2 = new Hardwork2();
		
//		AbstractTest test = new AbstractTest();
//		test.companyName();
//		test.friends();
//		test.hardwork();
//		test.job();
//		test.sal();
//		test.techPractice();
		
		Hardwork1 work = new AbstractTest();
		work.companyName();
		work.hardwork();
		work.job();
		work.sal();
	}
}