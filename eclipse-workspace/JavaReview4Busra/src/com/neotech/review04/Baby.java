package com.neotech.review04;

public class Baby {
	
	//variables, attributes,properties of a baby 
	
	String name; 
	char gender;
	int weight;
	String hairColor;
	
	//methods, behavior, actions of a baby 
	
	void talk() {	
		System.out.println(name +" Baby is talking");	
		
	}
	void eat() {
		System.out.println(name +" Baby is eating");
	}
	void cry() {
		System.out.println(name+ " Baby is crying");
	}
	
	void displayInformation () {
		System.out.println(name + " gender is " +gender + " weight is " + weight);
	}
	
	
}
