package com.neotech.lesson11;

public class HomeworkArrays {

	public static void main(String[] args) {

		// Homework 1:
		// Create an array of chars and store 6 elements into it. Print all values from
		// the array.

		// Homework 2:
		// Create an array on integers and calculate the sum of all elements in an
		// array.

		// Homework 3:
		// Create an array of countries-Strings-. While retrieving all values from an
		// array print capital for each country.

		char[] bus = new char[6];

		bus[0] = 'B';
		bus[1] = 'U';
		bus[2] = 'S';
		bus[3] = 'R';
		bus[4] = 'A';
		bus[5] = '*';

		System.out.print(bus[0]);
		System.out.print(bus[1]);
		System.out.print(bus[2]);
		System.out.print(bus[3]);
		System.out.print(bus[4]);
		System.out.print(bus[5]);

		System.out.println();

		// System.out.println(bus[0]+bus[1]+bus[2]+bus[3]+bus[4]+bus[5]);

		// int[] b = new int[8];

		int[] b = { 33, 43, 44, 23, 12, 67, 78, 90 };

		int size = b.length;
		for (int x = 0; x < size; x++) {

			System.out.println(b[x]);

		}

		int total = 0;
		for (int num : b) {
			total += num;
		}
		System.out.println("The total is " + total);

		int sum = 0;
		for (int x = 0; x < b.length; x++) {

			sum += b[x];

		}
		System.out.println("the sum: " + sum);

		String[] strCountry = new String[3];

		strCountry[0] = "Istanbul";
		strCountry[1] = "Tokio";
		strCountry[2] = "Nyc";

		System.out.println(
				strCountry[0].toUpperCase() + " " + strCountry[1].toUpperCase() + " " + strCountry[2].toUpperCase());

		
	}

}
