package com.neotech.lesson09;

public class SkipNumbers {
	
	public static void main(String[] args) {
		
		//print numbers from 1 to 10 and skip 3,6,9 
		
		for (int i =1; i<=10; i++) 
		{
			
			if(i==3 || i==6 || i==9) 
			{
				continue;
				
			}
			
			System.out.println(i);
			
		}
		
		// print number from 20 to 30 and skip 23 to 28
		
		
		for (int b = 20; b<=30 ; b++) 
		{
		
			if (b>=23 & b<=28) {
				
			continue;
			}
			
			System.out.println(b);
		}
		
		}
	}


