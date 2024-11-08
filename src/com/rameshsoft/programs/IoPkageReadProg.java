package com.rameshsoft.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IoPkageReadProg {
	public static void main(String[] args) throws IOException {
		
File file = new File("C:\\Users\\MuleSoft\\OneDrive\\Desktop\\New folder\\RameshSoft\\src\\com\\rameshsoft\\programs\\hardwork.txt");
		
		boolean status = file.createNewFile();
		
		if(status)
		{
			System.out.println("File is created newly!");
		}
		else
		{
			System.out.println("Returns Existing file!");
		}
		
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		while(bufferedReader.ready())
		{
			String data = bufferedReader.readLine();
			System.out.println(data);
		}
		
		fileReader.close();
		bufferedReader.close();
		
		
	}
}
