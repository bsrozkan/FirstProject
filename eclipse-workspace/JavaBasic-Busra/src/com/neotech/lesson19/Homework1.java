package com.neotech.lesson19;

public class Homework1 {

	// Create a Class called Students
	// Create three variables studentName, studentID and numberOfStudents (should be
	// a static variable)
	// Create three objects of the Students Class
	// Set the value for studentName, studentID and increment the numberOfStudents
	// for each object
	// Print out total the number of students

	
	//instance variables 
	String studentName;
	int studentId;
	
	//static variables - this belongs to class 
	static int numberOfStudents;
	
	//static String school = "Neotech";

	void schoolInfo() {
		System.out.println("Name: " + studentName + " id: " + studentId + " number of students: " +

				numberOfStudents);

	}

}
