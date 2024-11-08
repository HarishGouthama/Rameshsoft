package com.rameshsoft.programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapProg {
	public static void main(String[] args) {
		
		//Map map = new Map();
		//Map map = new HashMap();
		HashMap map = new HashMap();
		
		map.put("Hardwork", "Job");
		map.put("Job", 456);
		map.put(91456 , 91456);
		map.put(56, 456);
		map.put('g', "Practice");
		map.put(null, null);
		map.put("Job", "Jobs");
		
		System.out.println(map);
		
		Object obj1 = map.get("Job");
		System.out.println(obj1);
		
		
		Object obj2 = map.getOrDefault(91456456, "Please do hardwork");
		System.out.println(obj2);
		
		Set setKeys = map.keySet();
		System.out.println(setKeys);
		
		Set entries = map.entrySet();
		System.out.println(entries);
		
		Collection values = map.values();
		System.out.println(values);
		
		
	}
}
