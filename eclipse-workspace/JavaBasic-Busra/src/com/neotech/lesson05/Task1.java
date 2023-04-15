package com.neotech.lesson05;

public class Task1 {
	
	public static void main(String[] args) {
		
		
		boolean isFriday= true;
		int date = 15;
		
		if (isFriday) {
			
			System.out.println("it's friday. i'm going to watch a movie");
			
			if (date==13) {
				
				System.out.println("i will watch scary movie");
			}
			
			else if (date==15)  {
				
				System.out.println("watch a thriller");
			}
			
			
			else {
				System.out.println("i will watch a comedy");
			}
			
		}
		
		else {
			System.out.println("it's not friday i'm going to study java");
			
		}
		
		
	}

}
