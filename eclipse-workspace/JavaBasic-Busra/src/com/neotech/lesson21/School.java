package com.neotech.lesson21;

public class School {
	
	public static void main(String[] args) {
		
		//1st constructor used
		Student st1 = new Student();
		
		st1.displayInfo();
		
		st1.name="Marry";
		st1.address="123 Main st";
		st1.displayInfo();
		
		System.out.println("----------");
		
		//2nd constructor used
		Student st2 = new Student("Carry","984 2nd ave");
		st2.displayInfo();
		
		//3rd constructor used 
		Student st3 = new Student("Busra");
		st3.displayInfo();
		
		
	}

}
