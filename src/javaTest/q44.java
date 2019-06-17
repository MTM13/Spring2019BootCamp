package javaTest;

import java.util.Scanner;

public class q44 {

	public static void main(String[] args) {
		int num, digit1, digit2, digit3, digit4, digit5;
		 Scanner  scan=new Scanner(System.in);
		 System.out.println("Enter your number:");
		 num=scan.nextInt();
		 
		 digit1 = num/10000;
		   System.out.println( digit1 );
		   num -= digit1*10000;

		   digit2 = num /1000;
		   System.out.println (digit2);
		   num -=digit2*1000 ;

		   digit3=  num/100;
		   System.out.println(digit3);
		   num -=digit3*100;

		   digit4= num /10;
		   System.out.println (digit4);
		   num -=digit4 *10;

		   digit5= num;
		   System.out.println (digit5);
			
		
	}

}