package com.rameshsoft.programs;

public class ImmutableMutableProg {
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Java");
		
		StringBuilder sb2 = sb1.append("Job");
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
		
		
		/* String s1 = new String("java");
		 
		 String s2 = s1.concat("Job");
		 
		 System.out.println(s1.hashCode());
		 System.out.println(s2.hashCode());
		 
		 if(s1.hashCode() == s2.hashCode())
		 {
			 System.out.println("Equal");
		 }
		 else
		 {
			 System.out.println("Not Equal");
		 }
		
		 System.out.println(s1.toString());
		 System.out.println(s1);
		 
		 System.out.println(s2.toString());
		 System.out.println(s2);
		*/
	}
}
