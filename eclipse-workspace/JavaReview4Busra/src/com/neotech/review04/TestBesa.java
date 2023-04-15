package com.neotech.review04;

public class TestBesa {
	
	public static void main(String[] args) {
		
		Besa b = new Besa();
		
		b.addTwoNumbers();
		b.addTwoNumbersThatIGive(5, 7);
		int res1 = b.addTwoNumbersAndGiveMeTheResult();
		
		System.out.println(res1);
		
		int res2 = b.addTwoNumbersGiveMeSum(10, 22);
		
		System.out.println(res2);
		
	}

}
