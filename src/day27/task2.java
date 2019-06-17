package day27;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = scan.nextLine();
		String[] newWord = sentence.split(" ");
		for ( String  looz :   newWord) {
			System.out.print(looz+" ");
		}

	}

}
