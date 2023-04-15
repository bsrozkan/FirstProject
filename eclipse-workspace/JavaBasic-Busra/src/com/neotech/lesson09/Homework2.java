package com.neotech.lesson09;

public class Homework2 {

	public static void main(String[] args) {

		// 1. Print numbers from 1 to 50 except those that are divisible by 3

		for (int b = 1; b <= 50; b++) {

			if (b % 3 == 0) {

				continue;
			}

			System.out.print(b+" ");

		}

	}

}
