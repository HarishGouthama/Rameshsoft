package com.rameshsoft.programs;

import java.util.IdentityHashMap;

public class IdentityHashMapProg {
	public static void main(String[] args) {
		
		
		IdentityHashMap map = new IdentityHashMap();
		
		map.put("Java", 456);
		map.put("Job", "Selenium");
		map.put(456, 91456);
		map.put("Selenium", "Hardwork");
		map.put(91456, 91456);
		map.put(null , null);
		
		System.out.println(map);
		
		
		
		
		
		
	}
}
