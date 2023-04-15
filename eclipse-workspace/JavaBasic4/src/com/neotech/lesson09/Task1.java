package com.neotech.lesson09;

public class Task1 {

	public static void main(String[] args) {
//		Print numbers from 1 to 100 in 1 line with space
		for(int a = 1; a <= 100; a++)
		{
			System.out.print(a + " ");
		}
		
		System.out.println();
		
//		Print numbers from 100 to 1
		for(int b = 100; b >= 1; b--)
		{
			System.out.print(b + " ");
		}
		
		System.out.println();
		
//		Print even numbers from 20 to 1 (2 ways)
		for(int c = 20; c >= 1; c--)
		{
			if (c % 2 == 0)
			{
				System.out.print(c + " ");
			}
		}
		System.out.println();
		for(int c = 20; c >= 1; c -= 2)
		{
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		//Print odd numbers between 20 and 50 (2 ways)

		for(int d = 20; d <= 50; d++)
		{
			if(d % 2 == 1)
			{
				System.out.print(d+ " ");
			}
		}
		
		
		//if we start by 20, we will add 2 --> 20, 22, 24
		//so we start by 21 ---> 21, 23...
		
		for(int d = 21; d <= 50; d += 2) 
		{
			System.out.print(d + " ");
			
		}
		
		
		
	}

}
