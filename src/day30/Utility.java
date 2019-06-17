package day30;

import java.util.Scanner;

public class Utility {

	public static void main(String[] args) {

		UserInput();
		UserInput();
		UserInput();

	}
    public static void UserInput() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter your name ");
    	String name = scan.next();
    	System.out.println("You entered "+name);
    	
    }
}
