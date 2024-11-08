package com.rameshsoft.programs;

interface I1
{
	void job1();
	void job2();
	interface I2
	{
		void job1();
		void job3();
		void job4();
	}
}

class I1IMPL implements I1{

	@Override
	public void job1() {
		System.out.println("JOB1");
	}

	@Override
	public void job2() {
		System.out.println("JOB2");
	}
	
}

class I2IMPL implements I1.I2
{

	@Override
	public void job1() {
		System.out.println("JOB1");
	}

	@Override
	public void job3() {
		System.out.println("JOB3");
	}

	@Override
	public void job4() {
		System.out.println("JOB4");
	}
	
}


public class InnerInterfaceProg implements I1,I1.I2{
	@Override
	public void job1() {
		System.out.println("JOB1");
	}

	@Override
	public void job2() {
		System.out.println("JOB2");
	}
	
	@Override
	public void job3() {
		System.out.println("JOB3");
	}

	@Override
	public void job4() {
		System.out.println("JOB4");
	}
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
	}
}
