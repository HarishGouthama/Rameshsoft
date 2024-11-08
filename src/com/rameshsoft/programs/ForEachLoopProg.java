package com.rameshsoft.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForEachLoopProg {
	public static void main(String[] args) {
		
		
		/*Set set = new HashSet();
		set.add("java");
		set.add("job");
		set.add("java");
		set.add("Selenium");
		set.add("java");
		set.add("Hardwork");
		set.add("java");*/
		
		
		
		List list  = new ArrayList();
		list.add("java");
		list.add("job");
		list.add("java");
		list.add("Selenium");
		list.add("java");
		list.add("Hardwork");
		list.add("java");
		
		for(Object obj : list)
		{
			String str = (String) obj;
			if(str.equalsIgnoreCase("java")) {
				System.out.println(" Do practice more");
			}
			System.out.println(obj);
		}
		
		
		
		
		
		/*int[] in = new int[5];
		in[0] = 456;
		in[1] = 91456;
		in[2] = 56;
		in[3] = 456;
		in[4] = 91456;
		
		
		for(int i : in)
		{
			if (i == 456)
			{
				System.out.println(" Do Practice");
			}
			
			System.out.println(i);
		}*/
		
		
	}
}
