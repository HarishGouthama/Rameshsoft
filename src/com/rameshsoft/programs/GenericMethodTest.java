package com.rameshsoft.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GenericMethodProg
{
	public void hardwork(List list) {
		list.add("Hardwork");
		list.add(456.456);
		list.add(456);
		
		
		System.out.println(list);
	}
	
	public void job(Map<String, String> map) { 
		map.put("456", "91456");
		map.put("456.456", "91456");
		map.put("JavaSelenium", "Job");
		System.out.println(map);
	}
}

public class GenericMethodTest {
	public static void main(String[] args) {
		
		
		GenericMethodProg prog = new GenericMethodProg();
		List list = new ArrayList();
		
		list.add(456);
		list.add("JOB");
		list.add(456456);
		list.add(91456);
		
		prog.hardwork(list);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("Java", "Selenium");
		map.put("Hardwork", "Job");
		map.put("JOB", "Practice");
		map.put("Salary", "Hike");
		
		prog.job(map);
		
	}
}
