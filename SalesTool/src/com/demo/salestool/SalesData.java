package com.demo.salestool;

public class SalesData {
	int data[] = { -1, 0, 2, 4, 8, 16, 32, 64, 128 };

	public void display() {
		System.out.println("Data:");
		for (int i : data) {
			System.out.println("Next value: " + data[i]);
		}
	}
}
