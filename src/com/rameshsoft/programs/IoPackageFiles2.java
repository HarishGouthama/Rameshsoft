package com.rameshsoft.programs;

import java.io.BufferedWriter;
//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IoPackageFiles2 {
	public static void main(String[] args) throws IOException {
		
		/*File file = new File("C:\\Users\\MuleSoft\\OneDrive\\Desktop\\New folder\\RameshSoft\\src\\com\\rameshsoft\\programs\\hardwork.txt");
		
		boolean status = file.createNewFile();
		
		if(status)
		{
			System.out.println("File is created newly!");
		}
		else
		{
			System.out.println("Returns Existing file!");
		}*/
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\MuleSoft\\OneDrive\\Desktop\\New folder\\RameshSoft\\src\\com\\rameshsoft\\programs\\hardwork.txt");
		//FileWriter fileWriter = new FileWriter(file);
		//FileWriter fileWriter = new FileWriter(file , true);		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write("Java");
		bufferedWriter.newLine();
		bufferedWriter.write("Selenium");
		bufferedWriter.newLine();
		bufferedWriter.write("Practice");
		bufferedWriter.newLine();
		bufferedWriter.write("Hardwork");
		bufferedWriter.newLine();
		bufferedWriter.write("Job");
		bufferedWriter.newLine();
		
		bufferedWriter.flush();
		fileWriter.close();
		bufferedWriter.close();	
		
		
	}
}
