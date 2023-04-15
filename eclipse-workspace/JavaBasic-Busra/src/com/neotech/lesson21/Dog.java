package com.neotech.lesson21;

public class Dog extends Animal {
	
	//dog specific properties 
	
	String breed;
	
	//dog spesific behaviors 
	public void bark() {
		System.out.println("only dogs bark!");
		System.out.println("the breed is " + breed);
	}
	
	

}
