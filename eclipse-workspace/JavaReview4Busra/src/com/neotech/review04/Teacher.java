package com.neotech.review04;

public class Teacher {
	
	String name;
	double salary;
	String subject;
	
	
	
	void teach (){
		System.out.println(name + " teacher teaches " + subject + " salary is " + salary  );
		
	}

	void yellAtStudent(String studentName) {
		System.out.println(name + " teacher yells at  " + studentName );
	}
	
	
}
