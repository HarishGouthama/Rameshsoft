package com.rameshsoft.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericsProg1 {
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Selenium");
		list.add("Hardwork");
		list.add("Job");
		list.add("Selenium");
		list.add("Java");
		
		
		for(String str : list)
		{
			//String str = (String) object;
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
				
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext())
		{
			int i = itr.next();
			if (i == 456) {
				System.out.println("JOB");
			}
			
			System.out.println(i);
		}
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(456, "java");
		map.put(56, "job");
		map.put(6, "hardwork");
		map.put(456456, "selenium");
		map.put(456, "java");
		map.put(91456, "java");
		
		System.out.println(map);
		
		
	}
	}
}
