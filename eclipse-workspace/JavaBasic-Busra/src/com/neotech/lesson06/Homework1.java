package com.neotech.lesson06;

public class Homework1 {

	public static void main(String[] args) {

		boolean allergy = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = true;
		boolean seafood = true;

		if (allergy) {
			// the patient has allergies
			System.out.println("You have allergy!");

			if (peanut) {
				System.out.println("Don't eat peanuts!");
			}
			
			if (lactose) {
				
				System.out.println("Don't drink milk!");
			}
			
			if (bee) {
				System.out.println("Stay away from bees!");
				
			}
			
			if (seafood) {
				System.out.println("Don't eat fish!");
			}
			

		}
		
		else {
			
			//the patient has NO allergies
			
			System.out.println("You're healthy!");
		}

	}

}
