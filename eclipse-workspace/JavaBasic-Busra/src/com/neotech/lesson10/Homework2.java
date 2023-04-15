package com.neotech.lesson10;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		// write a program that asks user to enter his/her username and password
		// until user enters them correctly.

		Scanner scan = new Scanner(System.in);

		String userName = "busra";
		String password = "123456";

		String userNameInput;
		String passwordInput;
		do {
			System.out.println("Please enter user username and password.");
			userNameInput = scan.next();
			passwordInput = scan.next();
			if (userNameInput.equals(userName) && password.equals(password)) {
				System.out.println("You are now logged in");
				break;
			}
		} while (userNameInput != userName || passwordInput != password);
	}

}
