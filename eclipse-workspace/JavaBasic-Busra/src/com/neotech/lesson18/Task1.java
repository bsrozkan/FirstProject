package com.neotech.lesson18;

public class Task1 {

	public static void main(String[] args) {

		Employee emp1 = new Employee();

		emp1.eID = "Ihsan";
		emp1.salary = 15000;

		Employee emp2 = new Employee();

		emp2.eID = "Shane";
		emp2.salary = 12000;

		emp1.printInfo();
		emp2.printInfo();

		Employee.CEO = "Ahmet";

		emp1.printInfo();
		emp2.printInfo();

	}

}
