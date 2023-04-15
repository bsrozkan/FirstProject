package com.neotech.lesson20;

public class ConstructorTypes {

	String name; 
	int age;
	
	
	//default constructor
	//no return type - not even void
	//same name as the class
	//no parameters
	ConstructorTypes()
	{
		System.out.println("I am a non-argument constructor");
	}
	
	//we can have parameters in constructors
	//signature: (String)
	ConstructorTypes(String str)
	{
		System.out.println("I am a constructor with a string " + str);
	}
	//signature: (int)
	ConstructorTypes(int num)
	{
		System.out.println("I am a constructor with an int " + num );
	}
	//signature: (double)
	ConstructorTypes(double d)
	{
		System.out.println("I am a constructor with a double " + d);
	}
	
	//signature: (String, int)
	ConstructorTypes(String str, int num)
	{
		System.out.println("I am a constructor with a String " + str + " and an int " + num);
	}
	
	//signature: (String, String)
	ConstructorTypes(String str, String str2)
	{
		System.out.println("I am a constructor with two strings: " + str + " " + str2);
	}
	

	
	
	public static void main(String[] args) {
		
		//using default constructor
		ConstructorTypes ct = new ConstructorTypes();
	//	System.out.println(ct.name + " " + ct.age);
		
									//signature: (String)
		ConstructorTypes ct1 = new ConstructorTypes("Sabah");
									//signature: (String, int)
		ConstructorTypes ct2 = new ConstructorTypes("Harun", 25);
		
		//java will complain if you try to use a construtor that does not exist
									//signature: (String, String, String)
//		ConstructorTypes ct3 = new ConstructorTypes("Volkan", "Aykut", "Mustafa");
		
	}

}
