package com.neotech.lesson18;

public class LocalVariables {
	
	void method1() {
		
		//local variables are only visible within the method 
		
		String name = "Gloria";
		int age = 28;
		System.out.println(name);
		System.out.println(age);
		
	}
	
	void method2 () {
		String name = "Mustafa";
		System.out.println(name);
		//System.out.println(age); --> its inside method1 i cant use it here if i dont declare 
		
	}

	public static void main(String[] args) {

		
		//i need to create an object inside of the main method to print method1 and method2 
		LocalVariables obj1 = new LocalVariables();
		obj1.method1();
		obj1.method2();
		
		
		
		
		boolean flag = true;
		if (flag) {
			String answer = "yes";
			System.out.println(answer);
			System.out.println(flag);

		}
		
		//System.out.println(answer); --> i cant get the result bc its out of boundary 
		//even its inside of main method
		
		System.out.println(flag);
		
		//the scope of an 'answer' if only the if blocks
		//the scope of the'flag' is the main method 
		
		
		System.out.println("----------");
		
		for (int i =0 ; i<=5; i++) {
			
			System.out.println(i);
			
		}
		
		//System.out.println(i); ---> i cant access the value of 'i' outside of the for loop 
		
		System.out.println("----------");
		
		int x;
		for (x=1; x<=5; x++) {
			System.out.println(x);
		}
		
		System.out.println(x);  //I'm allowed to print this but it gives wrong result bc it's out of the scope 
		
		
		String name= "Elion";
		System.out.println(name);
		
		
		

	}
	 
	
 
}
