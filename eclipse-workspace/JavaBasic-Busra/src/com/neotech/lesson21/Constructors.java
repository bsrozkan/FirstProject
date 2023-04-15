package com.neotech.lesson21;

public class Constructors {

	// 1st-default constructor
	public Constructors() {
		this(5);
		//this(2,4); is not allowed here 

	}

	// 2nd constructor
	public Constructors(int x) {
		this(2,4);
		
		System.out.println("Hello 2nd constructor");

	}

	// 3rd constructor
	public Constructors(int x, int y) {

		System.out.println("Hello 3rd constructor");

	}

	public static void main(String[] args) {

		//Constructors obj1 = new Constructors(3,5); //3rd constructor
		//Constructors obj2 = new Constructors (4); //2nd constructor
		Constructors obj3 = new Constructors (); //1st constructor
		
	}

}
