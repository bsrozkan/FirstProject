package com.neotech.lesson07;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {

		// Allow user to enter grade and then provide explanation:
		// A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		// At the endyour program should print which grade was entered by a user with
		// explanation.

		Scanner input = new Scanner(System.in);

		String grade;
		System.out.println("Enter your grade: ");
		grade = input.next();
		String result;
		

		switch (grade) {
		case "A":
			result = "Excelelent!";
			break;
		case "B":
			result = "Good!";
			break;
		case "C":
			result = "Average";
			break;
		case "D":
			result = "Bad!";
			break;
		default:
			result = "Not Acceptable";
			break;

		}
		
		System.out.println("Your grade is "+ grade + " it is " + result);

	}

}
