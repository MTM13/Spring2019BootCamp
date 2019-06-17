package javaTest;

import java.util.Scanner;

public class tasks {

	
	public static void main(String[] args) {
		
//      System.out.println(isAdultOrNot(23));
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