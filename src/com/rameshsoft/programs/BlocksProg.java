package com.rameshsoft.programs;

class BlocksProg1
{
	public BlocksProg1()
	{
		System.out.println("PC : DC");
	}
	static
	{
		System.out.println("Parent Class : SB11");
	}
	{
		System.out.println("CC : IB2");
	}
}

public class BlocksProg extends BlocksProg1 {
	
	static
	{
		System.out.println("Child Class : SB1");
	}
	{
		System.out.println("CC : IB1");
	}
	static
	{
		System.out.println("Child Class : SB2");
	}
	static
	{
		System.out.println("SB3");
	}
	public BlocksProg()
	{
		System.out.println("CC : DC");
	}
	public static void main(String[] args) {
		
		
		System.out.println("Main() Method");
		
		//BlocksProg1 prog = new BlocksProg1();
		BlocksProg prog = new BlocksProg();
				
		
		
	}
}
