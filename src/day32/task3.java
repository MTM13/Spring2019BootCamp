package day32;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// CREATE static method called giveMeBiggerNumber
		  // it takes 2 int as parameter 
		  // and return bigger number 
		  
		  // call the method couple times with different result 
		Scanner scan = new Scanner(System.in);
		System.out.println("give me two numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(giveMeAbigerNumber(num1, num2));
	}

	
	public static int giveMeAbigerNumber( int num1 , int num2) {
		
		
		
		if(num1>num2) {
			return num1;

			
		}else {
			return num2;

			
		}
		
	}
	
	
	
	
	
	
	
}
