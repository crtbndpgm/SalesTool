package com.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		// display header
		displayGreeting();
		data.display();
	}
	
	private static void displayGreeting() {
		System.out.println("HELLO HAPPY SALES PEOPLE!");
		System.out.println("THIS APP SHOWS SALES DATA");
	}

}
