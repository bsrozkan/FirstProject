package com.neotech.review04;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String str = "Merhaba";
		
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		 
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str);
		System.out.println(str.equals("merhaba"));
		System.out.println(str.equals("Merhaba"));
		boolean eq = str.equals("merhaba");
		System.out.println(eq);
		boolean eqq= str.equalsIgnoreCase("merhaba");
		System.out.println(eqq);
		
		System.out.println("------------");
		
		System.out.println(str.contains("rh"));
		System.out.println(str.contains("RH"));
		
		boolean starts = str.startsWith("m");
		System.out.println(starts);
		
		System.out.println(str.startsWith("Mer"));
		
		
		
	}

}
