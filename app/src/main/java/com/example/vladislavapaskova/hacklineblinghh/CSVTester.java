
package com.example.vladislavapaskova.hacklineblinghh;

public class CSVTester {

	public static void main(String[] args){
		Database database = new Database();
		database.transferCSV();
		System.out.println( database.retrieve( "One") );
		System.out.println( database.retrieveAnswer() );
		System.out.println( database.retrieveHint1() );
		System.out.println( database.retrieveHint2() );
		System.out.println( database.retrieveSource() );
	}
}
