package com.neotech.review04;

public class MethodWithReturn {

	public static void main(String[] args) {

		String name = "Busra";
		int numOfChars = name.length();

		System.out.println("The length of " + name + " is " + numOfChars);

		MethodWithReturn m = new MethodWithReturn();
		boolean res = m.isOdd(13);

		System.out.println("the number 13 is odd? " + res);
		
		
		//m.isOddEnhanced(44);
		
		System.out.println(" is 44 odd? " + m.isOddEnhanced(44));

	}

	boolean isOdd(int num) {

		boolean result;

		if (num % 2 == 1) {
			result = true;
		} else {
			result = false;
		}
		return result;

	}

	// shorter way

	boolean isOddEnhanced(int num) {

		return num % 2 == 1;

	}

}
