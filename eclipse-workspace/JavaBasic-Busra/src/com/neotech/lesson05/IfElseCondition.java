package com.neotech.lesson05;

public class IfElseCondition {
	
	public static void main(String[] args) {
		
		double d1 = 15.5;
		double d2 = 15;
		
		if (d1>d2) {
			
			System.out.println("Number "+ d1+ " is larger than " +d2);
			
		}
		else if (d1<d2) {
			
			System.out.println("Number" +d1+"is equal to"+d2);	
			
		}
		
		else {
			System.out.println("Number"+d1+"is equal to"+d2);
			
			
		}
		
	}

}
