package com.neotech.lesson17;

public class Homework2 {

	public static void main(String[] args) {

		String str = "Hello123456@#%^&*)All((&(";

		String str2 = str.replaceAll("[^a-zA-Z]", "");

		System.out.println(str2);
		
		System.out.println("How many alpha characters are there? " + str2.length());
		
		//how many numbers are there
		System.out.println(str.replaceAll("[^0-9]", "").length());
		
		//how many special characters we have 
		
		System.out.println(str.replaceAll("[a-zA-Z0-9]", "").length());
		
		//typical issues
		
		String str3= str.replaceAll("a-z", "-"); //this is not a regex - a regular expression
		String str4= str.replaceAll("[az]", ""); //this might not be what you expect--only a and z 
		
		

	}
}