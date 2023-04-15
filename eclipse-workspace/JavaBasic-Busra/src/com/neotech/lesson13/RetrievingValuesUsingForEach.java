package com.neotech.lesson13;

public class RetrievingValuesUsingForEach {
	
	public static void main(String[] args) {
		
		int [] [] grades = {
				{4,3,2,1},
				{5,6,7,8},
				{3,2},
				{9,8,7}
		};
		
		for(int [] i:grades)
		{
			for(int x :i) {
				
				System.out.print(x + " ");
			}
			
			System.out.println();
		}
		
		
		
	}

}
