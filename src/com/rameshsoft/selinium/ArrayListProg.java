package com.rameshsoft.selinium;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListProg {
	public static void main(String[] args) {
		
		//Collection collection = new Collection();  invalid
		//List list = new List(); invalid
		
		//Collection collection = new ArrayList(); valid
		//List list = new ArrayList(); valid
		ArrayList list = new ArrayList();
		list.add(456);
		list.add(456);
		list.add(null);
		list.add("job");
		list.add('h');
		list.add(456.456);
		list.add("job");
		list.add(456);
		list.add(456);
		list.add(null);
		list.add("job");
		list.add('h');
		list.add(456.456);
		list.add("job");
		
		System.out.println(list);
		
		Object obj = list.get(1);
		System.out.println(obj);
		
		Object obj3 = list.get(3);
		System.out.println(obj);
		
		Object obj9 = list.get(9);
		System.out.println(obj);
		
		list.add(0, "Java");
		
		System.out.println(list);
	}
}
