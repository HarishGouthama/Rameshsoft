package com.rameshsoft.programs;

public class TwoDimensionalProg {
	public static void main(String[] args) {
		
		
		String[][] str = new String[2][2];
		
		str[0][0] = "Java";
		str[0][1] = "Job";
		str[1][0] = "Hardwork";
		str[1][1] = "Practice";
		
		
		for(int row = 0 ; row < str.length ; row++)
		{
			for(int col = 0 ; col < str.length; col++)
			{
				System.out.println(str[row][col]);
			}
		}
	}
}
