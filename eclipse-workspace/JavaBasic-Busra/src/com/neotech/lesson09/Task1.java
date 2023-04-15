package com.neotech.lesson09;

public class Task1 {

	public static void main(String[] args) {

		// Print numbers from 1 to 100 in 1 line with space
		// Print numbers from 100 to 1
		// Print even numbers from 20 to 1 (2 ways)
		// Print odd numbers between 20 and 50 (2 ways)

		for (int b = 1; b <= 100; b++) {

			System.out.print(b + " ");

		}

		System.out.println("--------");

		for (int i = 100; i >= 1; i--) {

			System.out.println(i + " ");
		}

		System.out.println("--------");

		for (int x = 20; x >= 1; x--) {

			System.out.print(x + " ");

		}
		System.out.println("--------");

		for (int c = 20; c >= 1; c--) {

			if (c % 2 == 0) {

				System.out.print(c + " ");
			}
		}

		for (int y = 20; y >= 1; y -= 2) {

			System.out.print(y + " ");
		}

		for (int z = 20; z <= 50; z++) {

			if (z % 2 == 1) {
				System.out.print(z + " ");
			}
		}

		for (int d = 21; d <= 50; d += 2) {

			System.out.print(d + " ");
		}

	}

}
