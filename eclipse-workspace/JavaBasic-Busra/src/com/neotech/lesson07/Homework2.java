package com.neotech.lesson07;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		int day;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number for a day (1-7): ");

		day = input.nextInt();

		// ---Using && Operator---

		if (day >= 1 && day <= 5) // [1-5]
		{
			System.out.println("It's a weekday!");
		} else if (day >= 6 && day <= 7) // [6-7]
		{
			System.out.println("It's a weekend!");
		}

		else // anything else
		{
			System.out.println("Invalid input!");
		}

		// ----- Using || (or) Operator -----

		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {

			System.out.println("It's a weekday!");

		} else if (day == 6 || day == 7) {
			System.out.println("It's a weekend!");
		} else {
			System.out.println("Invalid input!");

		}

		// ----Using && + || Operators-----

		if (day >= 1 && day <= 5) {
			System.out.println("It's a weekday!");
		}

		else if (day == 6 || day == 7) {
			System.out.println("It's a weekend!");

		}

		else {
			System.out.println("Invalid input!");
		}

	}

}
