package com.neotech.lesson18;

public class CatDemo {

	public static void main(String[] args) {

		Cat cat1 = new Cat(); // created an istance of cat

		cat1.name = "Leo";
		cat1.color = "Gray";
		cat1.weight = 8;

		cat1.sayMeow();
		cat1.displayCatInfo();

		Cat cat2 = new Cat();

		cat2.name = "Prens";
		cat2.color = "Black";
		cat2.weight = 8;

		cat2.sayMeow();
		cat2.displayCatInfo();

		System.out.println(cat1.name + " is " + cat1.color);

		System.out.println(cat2.name + " is " + cat2.color);
		
		//i changed the name of cat1 
		cat1.name="Daisy";
		
		System.out.println(cat1.name);
		System.out.println(cat2.name);
		
		
		System.out.println("---------");
		
		cat1.displayCatInfo();
		cat2.displayCatInfo();
		
		

	}

}
