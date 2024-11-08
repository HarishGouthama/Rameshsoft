package com.rameshsoft.programs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsProg {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try
		{
			System.out.println("Try Block");
			fw =  new FileWriter(new File("C:\\Users\\MuleSoft\\OneDrive\\Desktop\\New folder\\RameshSoft\\src\\com\\rameshsoft\\programs\\hardwork.txt"));
			bw = new BufferedWriter(fw);
		}
		catch(Exception exception)
		{
			System.out.println("CAtch Block");
		}
		finally
		{
			if(bw!=null) {
				bw.close();
			}
			System.out.println("FInally Block");
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
