package com.neotech.review01;

import java.util.Scanner;

public class CalculatorIfElse {

	public static void main(String[] args) {

		Scanner busra = new Scanner(System.in);

		System.out.println("Please enter first number: ");
		double d1 = busra.nextDouble();

		System.out.println("Please enter second number: ");
		double d2 = busra.nextDouble();

		System.out.println("Please enter the operator (+,-,*,/) ");
		String operator = busra.next();
		
		double result = 0;

		if (operator.equals("+")) {
			System.out.println("The result is: " + (d1 + d2));
		} else if (operator.equals("-")) {
			System.out.println("The result is: " + (d1 - d2));
		} else if (operator.equals("*")) {
			System.out.println("The result is: " + (d1 * d2));
		} else if (operator.equals("/")) {
			System.out.println("The result is: " + (d1 / d2));
		} else {
			System.out.println("Invalid input");
		}

	}

}
