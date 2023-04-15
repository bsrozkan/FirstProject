package com.neotech.lesson18;

public class Homework2 {

	public static void main(String[] args) {

		String str = "Today is Tuesday and we have a Java Class";

		// we need to do it in 2 steps
		// first split the long string words and then reverse the words

		String[] strArray = str.split(" ");
		Homework2 hw2 = new Homework2();

		for (String word : strArray) {
			
			//1st way

			String reversedWord = hw2.reverseString(word);

			System.out.print(reversedWord + " ");
			
			
			//2nd way
			StringBuffer sb = new StringBuffer(word); 
			System.out.print(sb.reverse()+ " ");
			
			
		}

	}

	
	//this is the main thing for our code
	//this body makes our code run
	//understand this one and you can use it for every reversed methods
	//important part
	
	String reverseString(String input) {
		String reversed = "";

		char[] letters = input.toCharArray();
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += letters[i];

		}

		return reversed;

	}

}
