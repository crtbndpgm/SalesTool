package com.demo.salestool;

public class SalesData {
	int data[] = { 0, 2, 4, 8, 16, 32 };

	public void display() {
		System.out.println("Data:");
		for (int i = 0; i < data.length; i++) {
			System.out.println("Next value: " + data[i]);
		}
	}
}
