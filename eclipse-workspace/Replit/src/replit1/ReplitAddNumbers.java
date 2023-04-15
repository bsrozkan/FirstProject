package replit1;

import java.util.Scanner;

public class ReplitAddNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("pls enter a number ");

		int num1 = scan.nextInt();

		System.out.println("pls enter second number");

		int num2 = scan.nextInt();

		System.out.println("pls enter third number");
		int num3 = scan.nextInt();

		int sum = num1 + num2 + num3;

		System.out.println("Sum of number : ValueOfSum is: " + sum);

	}
}