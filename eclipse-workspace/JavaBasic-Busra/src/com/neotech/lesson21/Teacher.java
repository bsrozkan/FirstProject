package com.neotech.lesson21;

public class Teacher {

	String name, subject;
	char gender;
	int age;

	public void teach() {

		System.out.println("they teach!");

	}

	public void displayInfo() {

		System.out.println(
				"teacher name is " + name + " and teaches " + subject 
				+ " gender is " + gender + " and age is " + age);

	}

	public static void main(String[] args) {

		//Teacher t = new Teacher();
		//t.name = "brad";
		//t.displayInfo();

		System.out.println("----------");

		MathTeacher math = new MathTeacher();
		math.name = "ilkay";
		math.subject = "math";
		math.age = 34;
		math.gender = 'F';
		math.teach();
		math.math();
		math.displayInfo();

		System.out.println("----------");

		ChemistryTeacher chem = new ChemistryTeacher();
		chem.name = "Kaan";
		chem.subject = "chemistry";
		chem.age = 30;
		chem.gender = 'M';
		chem.teach();
		chem.lab();
		chem.displayInfo();

		System.out.println("----------");

		PianoTeacher pi = new PianoTeacher();
		pi.name = "asli";
		pi.subject = "piano";
		pi.age = 27;
		pi.teach();
		pi.gender = 'F';
		pi.sing();
		pi.displayInfo();

	}

}
