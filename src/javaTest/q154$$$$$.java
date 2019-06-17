package javaTest;

import java.util.Scanner;

public class q154$$$$$ {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int a = 0;
		int b = 1;
		int count=0;
		for (int i = b; i < input; i++) {
			int sum = a+b;
			a=b;
			b=sum;
			count=sum;
        System.out.print(sum+" ");
        System.out.println();
        System.out.println("B value is "+b+" ");
        System.out.println("A value is "+ a+" ");
		}
     System.out.println("Value count is ("+count+")");
	}

}
