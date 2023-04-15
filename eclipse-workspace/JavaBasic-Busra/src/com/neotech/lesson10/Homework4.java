package com.neotech.lesson10;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {

		// create a program that will be asking to apply for a credit card 10 times
		// as soon as you get a 'yes' from a user program should stop asking

		// use for loop since there is number of iterations
		// ask a max of 10 times and if you get 'yes' before it; break the loop

		Scanner scan = new Scanner(System.in);

		String input;
		
		//ask user ten times 
		
		for(int i=0; i<10; i++) {
			System.out.println("Do you want to apply for a credit card?");
			input = scan.next();
			
			if (input.equals("yes")) {
				
				System.out.println("You got it!");
				
				break;
				
			}
			
		}

	}

}
