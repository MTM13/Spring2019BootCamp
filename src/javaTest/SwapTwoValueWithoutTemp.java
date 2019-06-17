package javaTest;

import java.util.Scanner;

public class SwapTwoValueWithoutTemp {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		

	}

}
