package com.neotech.lesson11;

public class PrintArrays {

	public static void main(String[] args) {

		int[] points = { 90, 85, 95, 75, 93, 95, 100 };

		// printing one by one
		System.out.println(points[0]);
		System.out.println(points[1]);

		// shorter way to print
		int size = points.length;

		for (int i = 0; i < size; i++) {

			System.out.println(points[i]);
		}

		// how can we get the sum of all values in the points array?
		// what about the average?

		int sum = 0;

		for (int i = 0; i < points.length; i++) {

			sum += points[i];

		}
		System.out.println("The sum is: " + sum);

		System.out.println("The average is: " + sum / points.length);

	}

}
