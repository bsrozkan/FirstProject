package com.neotech.lesson06;

public class Homework1 {
	public static void main(String[] args) {
		// Write a java program to check if a patient has allergies.
		// If the patient does not have allergies print “You’re healthy!”.
		// If the patient has allergies,
		// check if it is a peanut allergy,
		// lactose allergy, bee allergy or seafood allergy
		// and print a statement telling the patient “Don’t eat ___”.
		// (fill the line with the food names – peanut, seafood etc.)

		boolean allergy = true;
		boolean peanut = false;
		boolean lactose = true;
		boolean bee = true;
		boolean seafood = false;

		// Format the code
		// Windows ctrl + shift + f
		// MacOS command + shift + f
		// Run the code: Ctrl or Cmd + F11

		if (allergy) {
			// the patient has allergies
			System.out.println("You have allergy!");

			if (peanut) {
				// the patient has peanut allergies
				System.out.println("Dont eat peanuts!!!");
			}

			if (lactose) {
				// the patient has lactose allergy
				System.out.println("Dont drink milk!!!");
			}

			if (bee) {
				// the patient has bee allergy
				System.out.println("Stay away from bees!!!");
			}

			if (seafood) {
				// the patient has sea food allergy
				System.out.println("Dont eat fish!!!");
			}
		} else {
			// the person has no allergies
			System.out.println("You’re healthy!");
		}

	}

}
