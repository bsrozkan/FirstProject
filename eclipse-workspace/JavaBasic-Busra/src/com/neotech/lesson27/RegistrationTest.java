package com.neotech.lesson27;

public class RegistrationTest {
	
	public static void main(String[] args) {
		
		Registration r = new Registration ();
		System.out.println("----Email----");
		
		r.setEmail("brian@fox.com");
		//r.getEmail();
		System.out.println("Email ->" + r.getEmail());
		
		r.setEmail("bbb@yahoo.com");
		System.out.println("Email ->" + r.getEmail());
		
		System.out.println("-----Username----");
		r.setUserName("abcd");
		System.out.println("username-> "+ r.getUserName());
		
		
		
	}

}
