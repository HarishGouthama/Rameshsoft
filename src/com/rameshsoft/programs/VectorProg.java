package com.rameshsoft.programs;

import java.util.Stack;
import java.util.Vector;

public class VectorProg {
	public static void main(String[] args) {
		
		Vector vector = new Vector();
		vector.add(456);
		vector.add(0 ,  "Jpb");
		vector.addElement(456456);
		vector.add("Hardwork");
		vector.add(456);
		
		System.out.println(vector);
		
		Stack stack = new Stack();
		stack.add(91456);
		stack.add(0 , "Job");
		stack.addElement("Hardwork");
		stack.push("practice");
		stack.add(456456);
		System.out.println(stack);
		
		Object obj0 = stack.get(0);
		System.out.println(obj0);
		
		Object obj = stack.firstElement();
		System.out.println(obj);
		
		Object obj2 = stack.peek();
		System.out.println(obj2);
	}
}
