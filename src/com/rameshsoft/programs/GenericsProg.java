package com.rameshsoft.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericsProg {
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Selenium");
		list.add("Hardwork");
		list.add("Job");
		list.add("Selenium");
		list.add("Java");
		
		
		for(Object object : list)
		{
			String str = (String) object;
			if(str.equalsIgnoreCase("Java"))
			{
				System.out.println("Do Hardwork");
			}
	 	
		
		System.out.println(str);
		
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(456);
		set.add(91456);
		set.add(56);
		set.add(6);
		set.add(456456);
		set.add(456);
		
		
		
		
	}
	}
}
