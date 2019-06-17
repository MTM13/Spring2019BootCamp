package day28;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your mix words");
		String word = scan.next();
		int sum=0;
	for (int i = 0; i < word.length(); i++) {
		sum= sum+i;
		char x = word.charAt(i);
		if( x >='0' && x <='9') {
			boolean isNumber = Character.isDigit(word.charAt(i));
		int num = Integer.parseInt(word.substring(x,x+1));
		System.out.println(sum);
		}
	}
	System.out.print(0);
	
	
	
	
	
	}
}
