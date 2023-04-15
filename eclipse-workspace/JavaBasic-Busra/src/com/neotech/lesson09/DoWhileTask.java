package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileTask {
	
	public static void main(String[] args) {
		
		//ask a use: Guess the number
		//Lucky number is 5
		//as long as the entered number is not 5 we need keep ask for trying
		//once number is correct--> "You're number"
		
		
		int luckyNumber = 5;
		
		Scanner scan = new Scanner (System.in);
		
		int number;
		
		
		do {
			
			System.out.println("Guess my number: ");
			number = scan.nextInt();
			
		} while (number != luckyNumber); 
		
		System.out.println("You're a winner!");
			
		
		
		
	}
	
} 