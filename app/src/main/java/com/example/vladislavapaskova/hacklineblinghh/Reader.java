package com.example.vladislavapaskova.hacklineblinghh;

import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Reader {
	/**
	public static void main(String[] args) throws IOException {
		
		ArrayList<String> arr = new ArrayList<String>();
		StringBuffer buffer = new StringBuffer(); 
		
		//File inputFile = null;
		
		FileReader inputStream = null;
		
		try{
			
			//inputFile = new File( args[0] );

			inputStream = new FileReader("/Users/OnjiBae/Desktop/HacklineBling/test.txt");
			
			Scanner scan = new Scanner( inputStream );
			//Database database = new Database();
			
			String line = "";
			
			while( scan.hasNextLine() ){
				line += scan.nextLine() + "\n";
			}
			
			System.out.println( line );
			
			//input line as Question object
			scan.close();
			
		}
		
		catch( FileNotFoundException e ){
			e.printStackTrace();
			System.out.println("File not found!");
		}
		

		
		
	}
	 **/

}
