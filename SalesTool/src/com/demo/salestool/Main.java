package com.demo.salestool;

public class Main {
	public static void main(String[] args) {
		SalesData data = new SalesData();
		// display header
		displayGreeting();
		data.display();
	}
	private static void displayGreeting() {
		System.out.println("Hello Happpy Sale People!");
		System.out.println("This app shows sales data");
		System.out.println("-------------------------");
		System.out.println("test 1");
		System.out.println("test 2");
	}
}
