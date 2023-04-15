package com.neotech.review04;

public class ReplaceDemo {

	public static void main(String[] args) {

		String longStr = "I am very happy today because today is not Monday";

		String anotherStr = longStr.replace('a', 'e');
		System.out.println(anotherStr);

		anotherStr = longStr.replace("today", "tomorrow");

		System.out.println(anotherStr);

		System.out.println("---------------");

		// regular expression

		anotherStr = longStr.replaceAll("[a-z]", "*");

		System.out.println(anotherStr);
		
		anotherStr = longStr.replaceAll("[^a-k]", "*");

		System.out.println(anotherStr);
		
		String ssn ="131-23-3432";
		
		String newSSN = ssn.replaceAll("[0-2]", "*");
		
		System.out.println(newSSN);
		
		

	}

}
