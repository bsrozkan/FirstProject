package com.neotech.review01;

import java.util.Scanner;

public class ScannerReview {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// .next() reads one word until the space 
		
		System.out.println("Please enter your first name ");
		String firstName = scan.next();
		System.out.println("Your name is " + firstName);
	}

}
