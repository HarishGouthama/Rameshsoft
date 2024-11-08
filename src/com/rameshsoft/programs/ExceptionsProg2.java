package com.rameshsoft.programs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsProg2 {
	public static void main(String[] args) throws IOException {
		
		
		try(FileWriter fw = new FileWriter(new File("C:\\Users\\MuleSoft\\OneDrive\\Desktop\\New folder\\RameshSoft\\src\\com\\rameshsoft\\programs\\hardwork.txt"));BufferedWriter bw = new BufferedWriter(fw);)
		{
			System.out.println("Try Block");
			bw.write("Java");
			bw.flush();
		}
		catch(Exception exception)
		{
			System.out.println("CAtch Block");
		}
			
		
		
		/*try
		{
			System.out.println("try block");
			FileInputStream fip  = new FileInputStream("C:\\Users\\MuleSoft\\OneDrive\\Desktop\\New folder\\RameshSoft\\src\\com\\rameshsoft\\programs\\hardwork2.txt");
		}
		catch(Exception exception)
		{
			System.out.println("Catch block");
			//exception.printStackTrace();
			//System.out.println(exception.toString());
			System.out.println(exception.getMessage());
		}*/	
		
	}
}
