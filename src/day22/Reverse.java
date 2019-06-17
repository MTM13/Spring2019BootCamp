package day22;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a name");
    String name = scan.next();
    for (int i = name.length()-1; i >=0;  i--) {
		
    	System.out.print(name.charAt(i));
    	
	}
	}

}
