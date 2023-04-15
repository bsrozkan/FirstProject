package com.neotech.lesson06;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		/*2. Write a program that calculates the sum of two numbers entered by
		 * the user.
		 * */
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int number1= input.nextInt();
		int number2 = input.nextInt();
		System.out.println("the sum is " + (number1+number2));
		
		
		
		
	}

}
