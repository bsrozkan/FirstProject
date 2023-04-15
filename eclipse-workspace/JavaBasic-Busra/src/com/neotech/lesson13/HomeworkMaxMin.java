package com.neotech.lesson13;

public class HomeworkMaxMin {

	public static void main(String[] args) {

		// IQ

		// Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?

		int[][] nums = { { 3, 6, 9 }, { 4, 8, 2 } };

		int max = nums[0][0];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {

				int n = nums[i][j];

				if (n > max) {
					max = n;

				}

			}

		}
		System.out.println("the max number is " + max);

		System.out.println("--------");

		int big = nums[0][0];

		for (int[] row : nums) {

			for (int num : row) {

				if (num > big) {

					big = num;
				}
			}

		}

		System.out.println(big);

		System.out.println("---------");

		int min = nums[0][0];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {

				int n = nums[i][j];

				if (n < min) {
					min = n;
				}

			}
			
			System.out.println("the min num is " + min);
		}
	}
}