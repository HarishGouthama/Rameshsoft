package com.rameshsoft.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExamProg1 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("Java");
		list.add("job");
		list.add("Selenium");
		list.add("Hardwork");
		list.add("practice");
		list.add("Java");
		list.add("Hardwork");
		list.add("practice");
		list.add("Hardwork");
		list.add("practice");
		list.add("Hardwork");
		list.add("Selenium");
		list.add("Java");
		list.add("Java");
		
		/*Set set = new HashSet(list);
		System.out.println(list);*/
		
		/*Set set = new HashSet();
		set.addAll(list);
		System.out.println(set);*/
		
		/*Set set = new HashSet();
		
		for(int i = 0 ; i < list.size() ; i++)
		{
			Object obj = list.get(i);
			set.add(obj);
		}
		System.out.println(set);*/
		
		Set set = new HashSet();
		List dup = new ArrayList();
		
		for(int i = 0 ; i < list.size() ; i++)
		{
			Object obj = list.get(i);
			boolean status = set.add(obj);
			if(status)
			{
				;;;;;
			}
			else
			{
				dup.add(obj);
			}
		}
		System.out.println(set);
		System.out.println("Removed duplicates are: " + dup);
		
	}
}
