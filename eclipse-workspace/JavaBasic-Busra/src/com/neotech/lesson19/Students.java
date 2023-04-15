package com.neotech.lesson19;

public class Students {
	
	public static void main(String[] args) {
		
		Homework1 st1 = new Homework1();
		
		st1.studentId= 449;
		st1.studentName = "Busra";
		
		//we use the class name bc it is static variable 
		Homework1.numberOfStudents++;
		
		Homework1 st2 = new Homework1();
		
		st2.studentName="Hakan";
		st2.studentId=300;
		Homework1.numberOfStudents++;
		
		Homework1 st3 = new Homework1();
		st3.studentId=333;
		st3.studentName="Harun";
		
		Homework1.numberOfStudents++;
		
		st1.schoolInfo();
		st2.schoolInfo();
		st3.schoolInfo();
		
		System.out.println("The total student number is: " + Homework1.numberOfStudents);
		
		
		
		
		
	}

}
