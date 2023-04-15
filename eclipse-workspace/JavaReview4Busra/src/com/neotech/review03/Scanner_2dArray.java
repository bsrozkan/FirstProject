package com.neotech.review03;

import java.util.Scanner;

public class Scanner_2dArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How many rows do you want in the array?");
		int rows = input.nextInt();

		System.out.println("How many columns do you want in the array?");
		int cols = input.nextInt();

		// Create the array (String[][] names)

		String[][] names = new String[rows][cols];

		// Fill the array

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				System.out.println("Pls enter a name: ");
				names[i][j] = input.next();

			}

		}

		System.out.println("-----------------");

		
		// print the array
		// I will print using enhanced/advanced loop 
		
		for (String[] row : names) {

			for(String name : row ) {
				
				System.out.print(name+ " ");
				
			}
			
			System.out.println();
		}

	}

}
