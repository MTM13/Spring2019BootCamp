package day27;

import java.util.Scanner;

public class ForEachLoopPractice2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your sentence");
		String word = scan.nextLine();
		String[] mas = word.split(" ");
		for(String Fish : mas) {
			System.out.println(Fish);
		}

	}

}
