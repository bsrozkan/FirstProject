package com.neotech.review04;

public class World {

	public static void main(String[] args) {

		// Declaring and initializing a variable
		Baby baby1 = new Baby();

		baby1.name = "Pepe";
		baby1.weight = 18;

		System.out.println("The name of baby1 is " + baby1.name);
		System.out.println("The haircolor of baby1 is " + baby1.hairColor);

		baby1.hairColor = "black";
		baby1.gender = 'M';

		System.out.println("The haircolor is " + baby1.hairColor + "The gender is " + baby1.gender);

		System.out.println("---------------");

		// declaring a variable of type baby

		Baby baby2;
		// baby2.name="Kylie"; it doesnt work if i dont create a new baby2
		baby2 = new Baby();

		System.out.println("The name of baby2 is " + baby2.name);

		baby2.name = "Sara";

		// re-assigning variable
		baby1.name = "aykut";

		baby2.gender = 'M';
		baby2.hairColor = "red";
		baby2.weight = 22;

		System.out.println("the hair color of baby2 is " + baby2.hairColor + "the name of baby2 is " + baby2.name
				+ " the weight of baby2 is " + baby2.weight);
		System.out.println(baby1.name);
		
		System.out.println("------------");
		
		baby1.cry(); 
		baby2.cry();
		baby1.eat();
		baby1.talk();
		baby2.eat();
		baby2.talk();
		
		System.out.println("----------");
		
		baby1.displayInformation();
		baby2.displayInformation();
		
		
		
		

	}

}
