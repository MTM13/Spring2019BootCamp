package javaTest;

import java.util.Scanner;

public class q54 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter full name:");
		String name1 = scan.nextLine();
        if((name1.equalsIgnoreCase("Max Payne")) || (name1.equalsIgnoreCase("Alan Wake"))) {
        	System.out.println("User found!");
        	
        }else {
        	System.out.println("User not found!");
        }
	}

}
