package com.neotech.lesson06;

public class Homework3 {

	public static void main(String[] args) {
		// write a java program to check wheter number is even or odd

		// set your number
		int number = 2373;
		boolean isEven = number % 2 == 0;

		// first method
		int remainder = number % 2;

		// check if the remainder is 0

		if (remainder == 0) {
			// the number is even
			System.out.println("This number is an even number!");
		} else {
			// the number is odd
			System.out.println("This number is an odd number!");
		}

		// second method
		if (remainder == 1) {
			// the number is even
			System.out.println("This number is an odd number!");
		} else {
			// the number is odd
			System.out.println("This number is an even number!");
		}

		// third method
		if (number % 2 == 1) {
			System.out.println("This number is an odd number!");

		} else {
			System.out.println("This number is an even number!");
		}

		// fourth method
		if (isEven) {
			System.out.println("This number is an even number!");
		} else {
			System.out.println("This number is an odd number!");

		}

	}

}
