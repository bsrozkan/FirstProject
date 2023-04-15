package com.neotech.lesson09;

public class Homework1 {

	public static void main(String[] args) {

		// 1. Write a program using while loop that calculates the
		// sum of the even numbers between 0 and 10.

		// 2. way - increment by 2
		//if we start from an even number and keep adding 2 it will always even 

		int b = 0;

		int total = 0;

		while (b <= 10) {

			total += b;

			b += 2;

		}
		
		System.out.println("The total is: "+ total);
		

	}

}
