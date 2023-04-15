package com.neotech.lesson08;

import java.util.Scanner;

public class ReplitTime {
	
	public static void main(String[] args) {
		
	
    
	int hour,minute,second;
    String amOrPm;
	
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter hour:");
    System.out.println("Enter minute:");
    System.out.println("Enter second:");
    
    hour   = sc.nextInt();
    minute = sc.nextInt();
    second = sc.nextInt();
    amOrPm = sc.next();
    
     //2. WRITE YOUR CODE HERE:
    


    if (hour>=1 && hour<=12) {
    	
    
      
       System.out.println(hour+":"+minute+":"+second+"PM");
    }

    else if (minute<=59 && minute>=1) {

      System.out.println(hour+":"+minute+":"+second);
      
    } 
    else {
      System.out.println(hour+":"+minute+":"+second+"AM");
      
    }


}

}

