package com.rameshsoft.programs;

public class MultiplicationTableProg {
public static void main(String[] args) {
	
	int tableNum = 20;
	
	// loop to execute the table
	
	for(int i = 1 ; i <= 100000 ; i++)
	{
		// print the table //20 * 1 = 20
		
		System.out.println(tableNum +" * " +i+ " = "+tableNum*i);
	}
}
}
