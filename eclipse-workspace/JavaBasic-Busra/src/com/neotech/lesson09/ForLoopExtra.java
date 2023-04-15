package com.neotech.lesson09;

public class ForLoopExtra {

	public static void main(String[] args) {

		// print numbers from 21 to 30

		for (int b = 21; b <= 30; b++) {

			System.out.println(b);

		}
		// print numbers from 20 to 1

		for (int i = 20; i >= 1; i--) {

			System.out.println(i);

		}

		// print odd numbers from 1 to 10 --1st way

		for (int i = 1; i <= 10; i += 2) {

			System.out.println(i);

		}

		// print odd numbers from 1 to 10 --2nd way
		
		for (int i = 1; i<=10; i++) {
			//if i%2==1 ---> i is odd number bc remainder is 1 
			//if i%2==0 ---> i is even number bc remainder is 0 
			
			if (i%2==1)
			{
				System.out.println(i);
			}
			
			
		}
		
		
		//Print the sum of numbers from 3 to 7
			int sum = 0;
			for(int a = 3; a <= 7; a++)
			{
				sum += a; //sum = sum + a;
			}
			System.out.println("Sum is: " + sum);
			
		
	}
}
	

	


