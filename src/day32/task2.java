package day32;

import java.util.Scanner;

public class task2 {

public static void main(String[] args) {
		
	// create a method called isAdultOrNot 
	  // It takes one int as a parameter 
	  //  and return a boolean 
	  // inside body --> if the number passed is more than 18  return true 
	  // else return false 
	  
	  // call your method couple times and print out the result 
	  // either by saving it or directly storing it 
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();		
		boolean result = isAdultOrNot(age);
		System.out.println(result);
	}
	public static boolean isAdultOrNot(int age) {
		if( age > 18 ) {
			
			return true;
		}else {
			return false;
		}
	}
}