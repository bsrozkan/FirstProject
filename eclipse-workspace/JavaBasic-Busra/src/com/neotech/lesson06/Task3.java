package com.neotech.lesson06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		/*
		 * 3. Write a program that asks user to enter two numbers and prints which one
		 * is larger.
		 */

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("enter first number");
		int firstNumber = input.nextInt();

		System.out.println("enter second number");
		int secondNumber = input.nextInt();
		
		if (firstNumber > secondNumber) {
			System.out.println(firstNumber + " is greater than " + secondNumber);
			
		}
		else if(firstNumber==secondNumber) 
		{
			System.out.println(firstNumber + " is equal to " + secondNumber);
		}

		else {
			System.out.println(firstNumber + " is not greater than " + secondNumber);
			
		}
		
		

	}
}