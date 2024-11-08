package com.rameshsoft.programs;

import java.util.Comparator;
import java.util.TreeSet;

class CustomSorting implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String str1 = (String) o1;
		String str2 = (String) o2;
		System.out.println("*********************");
		// TODO Auto-generated method stub
		//return str1.compareTo(str2); // Ascending order
		//return -str1.compareTo(str2);  // Descending order
		//return str2.compareTo(str1); //Descending order
		return -str2.compareTo(str1); //Ascending order
		
	}
	
}


public class ComparatorProg {
	public static void main(String[] args) {
		
		//TreeSet set1 = new TreeSet();
		CustomSorting sorting = new CustomSorting();
		TreeSet set1 = new TreeSet(sorting);
		set1.add("job");
		set1.add("Selenium");
		set1.add("abc");
		set1.add("hardwork");
		set1.add("job");
		set1.add("job");
		set1.add("Selenium");
		
		System.out.println(set1);
		
	}
}
