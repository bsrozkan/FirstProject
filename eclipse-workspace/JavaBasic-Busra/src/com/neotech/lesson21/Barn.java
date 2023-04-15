package com.neotech.lesson21;

public class Barn {

	public static void main(String[] args) {

		Animal a = new Animal();

		a.size = "Big";
		a.color = "Brown";
		a.age = 5;

		a.sleep();
		a.eat();
		a.displayInfo();

		System.out.println("---------");

		Dog d = new Dog();
		d.size = "zero"; //coming from animal
		d.color = "black"; //coming from animal
		d.age = 8; //coming from animal
		d.breed = "Husky"; // ------ specific to dog object ------
		
		d.eat();//coming from animal
		d.sleep();//coming from animal
		d.bark(); // ----- specific to dog object ------
		d.displayInfo();//coming from animal
		
		System.out.println("----------");
		
		Cat c = new Cat();
		c.size="baby";
		c.color="grey";
		c.age=3;
		
		c.meow();
		c.eat();
		c.sleep();
		c.displayInfo();
		
		

	}

}
