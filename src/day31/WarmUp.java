 package day31;

import java.util.concurrent.CountDownLatch;

public class WarmUp {
	// Create few static methods with no return type with below name and logic 
	//1- Create a method count From 1 to 10 
      public static void countFrom1To10() {
    	  
    	  for (int i = 1; i <= 10; i++) {
    		  System.out.print(i+" ");
    	  }
    	  System.out.println();
      }
      
      // 2- Create a method count From 1 to N
      // take i int as parameter
      // print 1 - N (number user passed)
 public static void countFrom1ToN() {
    	  int n = 7;
    	  for (int i = 1; i <= n; i++) {
    		  System.out.print(i+" ");
    	  }
    	  System.out.println();
 }
 
 // create a method called count down  take 1 int as parameter 
 // and count down till 1 in method body
 public static void countDown() {
	  int R = 10;
	  for (int i = R; i >= 1; i--) {
		  System.out.print(i+" ");
	  }
	  System.out.println();
 }
	public static void main(String[] args) {
		countFrom1To10();
		countFrom1ToN();
		countDown();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
