package com.rameshsoft.selinium;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CursorsProg {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("java");
		list.add("job");
		list.add("Selenium");
		list.add("Hardwork");
		list.add("job");
		list.add("java");	
		
		System.out.println(list);
		
		ListIterator itr = (ListIterator) list.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			String str = (String) obj;
			if (str.equalsIgnoreCase("job")) {
				System.out.println("    Do Practice");
			}
			System.out.println(obj);
		}
		 
		
	}
}
