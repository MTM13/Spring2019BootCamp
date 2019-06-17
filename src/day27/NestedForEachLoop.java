package day27;

import java.util.Scanner;

public class NestedForEachLoop {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your sentence");
		String word = scan.nextLine();
		String[] mas = word.split(" ");
		for(String Fish : mas) {
			System.out.println(Fish);

	}
		
		String go ="Break time";
		char [] wordChar = go.toCharArray();
		for(char c : wordChar) {
			System.out.println(c);
		}
		
		
		
		
	}
}
