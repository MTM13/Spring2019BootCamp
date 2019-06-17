package javaTest;

import java.util.Scanner;

public class counter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int count = scan.nextInt();
		int x =1;
		while(x<=count) {
			System.out.print(x+", ");
			x++;
		}
		
		
	}

}
