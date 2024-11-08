package com.rameshsoft.programs;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetProg {
	public static void main(String[] args) {
		
		Collection collection = new HashSet();
		Set set = new HashSet();
		System.out.println(set.add(456));
		System.out.println(set.add(456));
		System.out.println(set.add("Job"));
		System.out.println(set.add(456));
		System.out.println(set.add("Job"));
		System.out.println(set.add(456456));
		System.out.println(set.add(456456));
		System.out.println(set.add('d'));
		System.out.println(set.add(456456.456));
		System.out.println(set.add("Hardwork"));
		
		System.out.println(set);
		
		LinkedHashSet set1 = new LinkedHashSet();
		System.out.println(set1.add(456));
		System.out.println(set1.add(456));
		System.out.println(set1.add("Job"));
		System.out.println(set1.add(456));
		System.out.println(set1.add("Job"));
		System.out.println(set1.add(456456));
		System.out.println(set1.add(456456));
		System.out.println(set1.add('d'));
		System.out.println(set1.add(456456.456));
		System.out.println(set1.add("Hardwork"));
		
		System.out.println(set1);
	}
}
