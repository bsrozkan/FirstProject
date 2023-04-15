package com.neotech.lesson06;

import java.util.Scanner;

public class Task1 {

	/*
	 * Do this during the break guys 1. Write a program that asks user to enter
	 * first name and then last name. At the end system should display user’s full
	 * name
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name:");

		String name = input.next();
		System.out.println("Please enter your last name:");
		String lastName = input.next();
		System.out.println("Your name is " + name + " " + lastName);

	}

}
