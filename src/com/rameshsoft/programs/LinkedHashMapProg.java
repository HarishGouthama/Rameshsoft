package com.rameshsoft.programs;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapProg {
	public static void main(String[] args) {
		
		
		LinkedHashMap map = new LinkedHashMap();
		
		map.put("Hardwork", "Job");
		map.put("Job", 456);
		map.put(91456 , 91456);
		map.put(56, 456);
		map.put('g', "Practice");
		map.put(null, null);
		map.put("Job", "Jobs");
		
		System.out.println(map);
		
		Object obj2 = map.getOrDefault(91456456, "Please do hardwork");
		System.out.println(obj2);
		
		Set setKeys = map.keySet();
		System.out.println(setKeys);
		
		Set entries = map.entrySet();
		System.out.println(entries);
		
		
		boolean key = map.containsKey("Job");
		if(key)
		{
			System.out.println("Key is available: Job");
		}
		else
		{
			System.out.println("Key is not available: Job");
		}
		
		boolean val = map.containsKey("practice");
		if(val)
		{
			System.out.println("Val is available : practice");
		}
		else 
		{
			System.out.println("Val is not available : practice");
		}
		
		
		map.replace("Jobs", "Jobsss");
		System.out.println(map);
	}
}
