package com.neotech.lesson10;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// Write a program that asks user
		// to enter his/her username and password
		// until user enters them correctly.

		// how do we decide?
		// for or while or do while
		// for-loop is more suitable for a countable number of loops
		// here do while seems more suitable

		Scanner scan = new Scanner(System.in);

		// our own credetials
		String userName = "shane";
		String password = "123456";

		String userNameInput;
		String passwordInput;

		do {
			System.out.println("Enter username and password:");
			userNameInput = scan.next();
			passwordInput = scan.next();

			if (userNameInput.equals(userName) && passwordInput.equals(password)) {
				System.out.println("You are now logged in!");
				break;
			} else {
				System.out.println("Wrong username or password!");
			}

		} while (userNameInput != userName || passwordInput != password);
	}

}
