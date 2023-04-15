package com.neotech.lesson21;

public class USA {

	// instance variables

	String state, stateCapital;

	// constructor
	public USA(String state, String stateCapital) {
		this.state = state;
		this.stateCapital = stateCapital;

	}
	
	//methods 
	public void displayState() {
		System.out.println(state);
	}
	
	public void displayStateCapital () {
		System.out.println(stateCapital);
		
	}
	
	public void displayInfo() {
		this.displayState();
		this.displayStateCapital();
		
	}
	
	public static void main(String[] args) {
		
		USA us1 = new USA("New York","Philly");
		
		us1.displayInfo();
		System.out.println("--------");
		us1.displayState();
		System.out.println("---------");
		us1.displayStateCapital();
		
		
		
	}

}
