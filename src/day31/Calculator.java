package day31;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		System.out.println("Enter your operater");
		String oper = scan.next();
		mod(a, b, oper);
	}

	public static void mod(int a, int b, String oper) {

		if (oper.substring(0).equals("+")) {
			System.out.println(a + b);
		} else if (oper.substring(0).equals("-")) {
			System.out.println(a - b);
		} else if (oper.substring(0).equals("*")) {
			System.out.println(a * b);

		} else if (oper.substring(0).equals("/")) {
			System.out.println(a / b);

		} else if (oper.substring(0).equals("%")) {
			System.out.println(a % b);
		} else {
			System.out.println("not valid");
		}

		/*
		 * add two numbers int substract two numbers multiply divide mod
		 * 
		 * add (100,30) -- print 130 add (100,30) -- print 70 add (100,30) -- print 3000
		 * add (100,30) -- print 3 add (100,30) -- print 10
		 */

	}
}
