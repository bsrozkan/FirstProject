package com.neotech.review01;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {

		Scanner busra = new Scanner(System.in);

		System.out.println("Please enter first number: ");
		double d1 = busra.nextDouble();

		System.out.println("Please enter second number: ");
		double d2 = busra.nextDouble();

		System.out.println("Please enter the operator (+,-,*,/) ");
		String operator = busra.next();

		double result = 0;

		switch (operator) {
		case "+":
			result = d1 + d2;
			break;
		case "-":
			result = d1 - d2;
			break;
		case "*":
			result = d1 * d2;
			break;
		case "/":
			result = d1 / d2;
			break;
		default:
			System.out.println("Invalid operator");
			break;

		}
		
		if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
			System.out.println("The result is: " + result);
		}
		
		
	}

}
