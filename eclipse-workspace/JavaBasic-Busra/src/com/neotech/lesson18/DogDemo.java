package com.neotech.lesson18;

public class DogDemo {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog(); //i create an object so i can access the dog java class 
		
		dog1.name = "Qimi";
		dog1.age= 3;
		dog1.age=4;
		dog1.displayDogInfo();
		
		//how can i access static variables 
		//dog1 is an instance variable, i can print it but it's not suggested
		//------System.out.println(dog1.breed);------
		
		//we can access it by using the class name 
		System.out.println(Dog.paws);
		System.out.println(Dog.breed);
		
		System.out.println(dog1.name);
		
		Dog dog2 = new Dog();
		dog2.name = "Jager";
		dog2.age= 7;
		dog2.displayDogInfo();
		
		System.out.println("----------");
		
		Dog.breed="Sheppard"; //I changed the static variable 
		dog1.displayDogInfo();
		dog2.displayDogInfo();
		
		
		Dog dog3 = new Dog();
		dog3.name= "Magic";
		dog3.age=5;
		dog3.displayDogInfo();
		
		
	}

}
