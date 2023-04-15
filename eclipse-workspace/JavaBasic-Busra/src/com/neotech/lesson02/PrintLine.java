package com.neotech.lesson02;

// Windows --> ctrl + shift + f will format your code
// Mac --> cmd + shift + f will format your code
public class PrintLine {

	public static void main(String[] args) {

		System.out.println("What's up Yilmaz?");
		System.out.println("How you doing?");

		// println - prints and then moves to the new line
		// print - prints and DOES NOT move to the new line

		System.out.print("1");
		System.out.print("2");
		System.out.print("3"); // After printing 3, it will stay at the same line

		System.out.println("4"); // After printing 4, it will move at the new line
		System.out.println("5");
		System.out.println("6");

		// \n --> will move to the new line
		System.out.print("Do you like Java? \n Yes I do!");
	}

}
