package com.rameshsoft.programs;

public class kids1 {
	
	public void hardwork() {
		System.out.println("Hardwork = Job");
	}
	
	public static void job() {
		System.out.println("JOB = JOY");
	}
	public static void main(String[] args) {
		System.out.println("Do Hardwork");
		
		kids1 kids = new kids1();
		kids.hardwork();
		//kids.job();
		kids1.job();
	}
}
