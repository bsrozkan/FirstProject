package com.neotech.lesson13;

public class Task1 {

	public static void main(String[] args) {

		// create a 2d array of integer type with 3 rows and 4 columns
		// and print all values of the whole array.

		int[][] numbers = { { 4, 6, 8, 9 }, { 3, 6, 9, 2 }, { 2, 4, 6, 8 }

		};

		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}

			System.out.println();
		}

	}

}
