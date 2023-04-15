package com.neotech.review01;

import java.util.Scanner;

public class CalculatorChar {
	
	public static void main(String[] args) {
		
		Scanner busra = new Scanner(System.in);
		
		System.out.println("Please enter a character:");
		
		char op = busra.next().charAt(0);
		
		System.out.println("char:" + op );
		
		//char op2 = busra.next().charAt(0);
		//System.out.println("char:" + op2);
		
		

	}

}
