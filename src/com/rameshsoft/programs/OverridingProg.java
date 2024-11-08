package com.rameshsoft.programs;
class Parent{
	int PractHrs = 9;
	public void child() {
		System.out.println("PC: Enjoy");
	}
	public void study() {
		System.out.println("PC: Study");
	}
	public void job() {
		System.out.println("PC : JOB");
	}
	public void play() {
		System.out.println("PC : Play");
	}
}

class Child extends Parent
{
	
	public void study() {
		System.out.println("CC: I Don't Study");
		
	}
	
	public void friends() {
		System.out.println("CC: Friends");
	}
}
public class OverridingProg {
	public static void main(String[] args) {
		//Child child = new Child();
		//child.friends();
//		Parent parent = new Parent();
//		parent.child();
//		parent.job();
//		parent.play();
//		parent.study();
		
		Child child = new Child();
		child.child();
		child.job();
		child.play();
		child.study();
		child.friends();
		
		Parent parent = new Child();
		parent.child();
		parent.job();
		parent.play();
		parent.study();		
	}
}
