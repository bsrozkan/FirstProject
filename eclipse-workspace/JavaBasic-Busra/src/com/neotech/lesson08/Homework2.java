package com.neotech.lesson08;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		// 2. Write a program that asks user to enter
		// his/her username and password until user enters them correctly.

		String username, password;
		
		String userinfo = "neotech";
		String passwordinfo = "java";
		
		

		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Enter your username: ");
			username = scan.next();
			System.out.println("Enter your password: ");
			password = scan.next();
			
		}
		
		while (!username.equals(userinfo) || !password.equals(passwordinfo) );
		{

		System.out.println("Login is succesfull!!");
		
		}

	}

}
