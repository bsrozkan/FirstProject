package com.neotech.lesson24;

public class Student {

	protected void study() {
		System.out.println("Student is studying");
	}

	public void doHomework() {
		System.out.println("Student is doing homework");
	}

}

class NeotechStudent extends Student {
	@Override // if you write this compiler will warn you when it's not ok to override
	public void study() {
		System.out.println("Neotech student is coding");
	}

	public void getJob() { // this is blueprint not override
		System.out.println("Neotech student becomes QA");
	}

}

class CollegeStudent extends Student {
	@Override
	public void study() {
		System.out.println("College studenr is studying for finals");
	}

}

class SchoolStudent extends Student {
	@Override
	public void study() {
		System.out.println("School students are on a school trip");
		
	}
	
}
