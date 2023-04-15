package com.neotech.review04;

public class School {
	
	
	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		
		student1.studentNr = 333;
		student1.name="Pinar";
		student1.gradeLevel= 12;
		
		Student student2 = new Student();
		student2.name= "Victor";
		student2.studentNr= 444;
		student2.gradeLevel=11;
		

		Teacher teacher1 = new Teacher();
		
		teacher1.name= "Mine";
		teacher1.salary= 22500;
		teacher1.subject="Math";
		
		teacher1.teach();
		teacher1.yellAtStudent(student1.name);
		
		
		
		System.out.println("let's call the methods ");
		
		student1.sleep();
		student1.study();
		student2.sleep();
		student2.study();
		
		
		
		
		
	}

}
