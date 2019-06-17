package javaTest;

import java.util.Scanner;

public class TAssskkks {


	public static void reportName(String first, String last)   {
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter your name ");
		 first = scan.next();
		 last = scan.next();
          System.out.println("the length of first name is: "+ first.length());
          System.out.println("the length of last name is: "+ last.length());
      
          System.out.println("the initial of name is: "+ first.substring(0, 1)+last.substring(0,1));



		 
	}
	public static void main(String[] args) {
	
           String first = null;
           String last = null;
		reportName(first , last);
	}

}
