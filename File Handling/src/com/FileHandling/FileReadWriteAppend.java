package com.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class FileReadWriteAppend {public static void main(String[] args) {
	
	
	try {
		
		//Create a PrintWriter object
		PrintWriter out = new PrintWriter("newFile.txt");	
		//Write data to the file
	System.out.println("This is an effortless way to write to files...");
	System.out.println("On the next line");
	System.out.println("This is cool...");
	
		//Flush and close the writer
		out.flush();
		
		out.close();
		
		
		//For reading effortlessly
		BufferedReader reader = new BufferedReader(new FileReader(new File("newFile.txt")));
		
		String str ="";
		StringBuilder sb = new StringBuilder("");
		
//		Read from the file with Append
		while((str = reader.readLine()) != null) {
			sb.append(str);
		}
		
		System.out.println("Data from file : ");
		
		System.out.println(sb);
		
//		Close the reader
		reader.close();
		
		
	} catch (IOException e) {
		System.out.println("Issues : " + e.getMessage());
	}
	
	

}



}
