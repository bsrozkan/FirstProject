package com.neotech.lesson21;

public class Animal {
	
	String color, size;
	int age;
	
	public void eat() {
		System.out.println("all animals eat");
	}
	
	public void sleep() {
		System.out.println("all animals sleep");
	}
	
	public void displayInfo () {
		
		System.out.println("size: "+ size + " color: " + color +" age " + age  );
	}

}
