package com.rameshsoft.programs;


class VarArg{
	public void registrationForm(String...str) {
		System.out.println("Reg Form");
	}
	
	public void registrationForm() {
		System.out.println("0 Para Reg Form");
	}
	
	public void registrationForm(String str) {
		System.out.println("1 String reg form");
	}
	
	public void registrationForm(int i , String...str) {
		System.out.println("Reg Form");
	}
}
public class VarArgProg {
	public static void main(String[] args) {
		VarArg varArg = new VarArg();
		varArg.registrationForm();
		varArg.registrationForm(456);
		varArg.registrationForm(456,"Java");
		varArg.registrationForm(456,"Job","Java");
		varArg.registrationForm(456,"Job","Java","Hardwork");
		varArg.registrationForm(456,"Job","Java","Hardwork","Hardwork");
	}
}
