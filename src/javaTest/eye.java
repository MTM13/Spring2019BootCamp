package javaTest;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class eye {
	


	/*
	 * write a method to test a string is a parameter
	 * static method called isPalindrome
	 * it takes one String as a parameter
	 * return boolean
	 * space does not matter
	 */

	public static boolean isPalindrome(String name) {
		Scanner scan = new Scanner(System.in);
		System.out.println("give me names to check if palindrome or not");
		name = scan.nextLine();
		String reversed = "";
		name = name.replace(" ", "");
		for (int i = name.length()-1; i >= 0 ; i--) {
			reversed += name.charAt(i);
			
		}
	return reversed.equals(name);
		
	
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(isPalindrome(""));
	}

}
