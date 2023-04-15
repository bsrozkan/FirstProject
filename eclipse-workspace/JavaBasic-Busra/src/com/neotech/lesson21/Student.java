package com.neotech.lesson21;

public class Student {

	// instance variables
	String name, address;

	// constructor method to for initialization
	public Student() {

	}

	// 2nd constructor method
	public Student(String name, String address) {
		this.name = name;
		this.address = address;

	}

	// 3rd constructor method
	public Student(String name) {
		this.name = name;

	}
	
	public void displayInfo () {
		System.out.println("Name--> " + this.name + " address is --> " + this.address);
	}

}
