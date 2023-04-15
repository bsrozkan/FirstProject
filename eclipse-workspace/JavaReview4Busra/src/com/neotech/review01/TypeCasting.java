package com.neotech.review01;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		//byte < short < int < long < float < double 
		
		int intNumber = 50;
		
		//widening/implicit casting/automatically
		double doubleNumber = intNumber;
		
		System.out.println("intNumber-->"+intNumber);
		System.out.println("doubleNumber-->"+doubleNumber);
		
		//putting int to byte is narrowing and we MAY lose data and we do manually/explicit
		byte byteNumber = (byte)intNumber;	//we have to put (byte) before value because we take responsibility
		System.out.println("byteNumber-->" + byteNumber);
		
		//re-assign
		intNumber = 670;
		byte b2 = (byte) intNumber;
		System.out.println("b2--> "+b2); //we lost data 
		
		byte b3 = 90;
		int i3 = b3; //int is bigger container than byte so we don't lose data 
		System.out.println("i3--> " + i3);
		
		
	}

}
