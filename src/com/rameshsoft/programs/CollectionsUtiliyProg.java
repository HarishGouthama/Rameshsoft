package com.rameshsoft.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtiliyProg {
	public static void main(String[] args) {
		
		
		List list = new ArrayList();
		
		list.add("Java");
		list.add("abc");
		list.add("Selenium");
		list.add("hardwork");
		list.add("Job");
		list.add("Sal");
		list.add("Hike");
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		int num = Collections.binarySearch(list, "Hike123");
		
		System.out.println(num);
		if (num >= 0)
		{
			System.out.println("Key | Value is there");
		}
		else
		{
			System.out.println("Key |  value is not there");
		}
	}
}
