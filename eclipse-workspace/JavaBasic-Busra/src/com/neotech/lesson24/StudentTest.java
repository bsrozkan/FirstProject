package com.neotech.lesson24;

public class StudentTest {
	
	public static void main(String[] args) {
		
		System.out.println("-------Student Object; Student");
		Student std = new Student();
		std.study();
		std.doHomework();
		
		System.out.println("-------NeotechStudent Object; Neotech Student");
		NeotechStudent neo = new NeotechStudent();
		neo.study();
		neo.doHomework();
		neo.getJob();
				
		System.out.println("-------CollegeStudent Object; College Student");

		Student st1; //declaring a variable of type Student
		st1=new NeotechStudent(); // assigning an object of the child class
		
		Student st2 = new CollegeStudent(); // up-casting 
		st1.study(); // run time polymorphism 
		st2.study(); // acts like CollegeStudent 
		
		
	}

}
