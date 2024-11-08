package com.rameshsoft.selinium;


public class ConcurrentHashMap {
	public static void main(String[] args) {
		
		
		
		java.util.concurrent.ConcurrentHashMap map = new java.util.concurrent.ConcurrentHashMap();
		
		
		map.put("Java", 456);
		map.put("Job", "Selenium");
		map.put(456, 91456);
		map.put("Selenium", "Hardwork");
		map.put(91456, 91456);
		//map.put(null, null);
		
		System.out.println(map);
		
		
		
		
		
		
		
		
	}
}
