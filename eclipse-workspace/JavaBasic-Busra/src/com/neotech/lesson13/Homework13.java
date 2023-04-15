package com.neotech.lesson13;

public class Homework13 {

	public static void main(String[] args) {

		// Homework 1:
		// Create an array of countries:
		// north America countries, south America countries, Europe countries, Asian
		// countries, African countries.
		// Then print all values from that array using 2 different loops and calculate
		// how many total countries been stored.

		

		String[][] countries = { { "Canada", "Mexico", "USA" }, { "Brazil", "Argentina", "Colombia" },
				{ "Denmark", "Germany", "Italy" }, { "Thailand", "Vietnamese", "Japan" },
				{ "Nigeria", "Tanzania", "Congo" } };

		for (int i = 0; i < countries.length; i++) {

			for (int j = 0; j < countries[i].length; j++) {

				System.out.print(countries[i][j] + " ");
			}
			System.out.println();

		}
		
		System.out.println("--------------");
		
		for (String[] row:countries) {
			for (String b:row ) {
				System.out.print(b +" ");
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
