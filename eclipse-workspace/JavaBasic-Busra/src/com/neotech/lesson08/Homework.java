package com.neotech.lesson08;

public class Homework {

	public static void main(String[] args) {

		// 1. Write a program using while loop that calculates the
		// sum of the even numbers between 0 and 10.
		
		
		//1. way -- increment by 1 

		int a = 0;
		int sum = 0;

		while (a <= 10) {

			if (a % 2 == 0) {

				sum = sum + a;

				System.out.print(a + " ");
			}

			a++;
			
			
		}
		
		System.out.println("\nthe sum is: " + sum);
		

	
	}
}