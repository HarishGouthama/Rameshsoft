package com.rameshsoft.programs;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListProg {
	public static void main(String[] args) {
		
		//Collection collection = new LinkedList();
		//List list = new LinkedList();
		
		LinkedList list = new LinkedList();
		list.add(456);
		list.add("Job");
		list.add(456);
		list.add("Job");
		list.add(null);
		list.add(456.456);
		list.add(456.456);
		list.add(91456);
		list.addFirst(456456);
		
		System.out.println(list);
		
		Object obj5 =  list.get(5);
		System.out.println(obj5);
		
		Object obj1 =  list.get(2);
		System.out.println(obj1);
		
		Object objLast =  list.getLast();
		System.out.println(objLast);
	}
}
