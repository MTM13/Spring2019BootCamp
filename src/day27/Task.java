package day27;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scan.next();
		char[] newWord = word.toCharArray();
		for ( char  looz :   newWord) {
			System.out.print(looz+"-");
		}
			
		}

	}


