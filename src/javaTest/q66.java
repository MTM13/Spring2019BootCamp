package javaTest;

import java.util.Scanner;

public class q66 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int half = word.length()/2;
		System.out.println(word.substring(0, half)+word.substring(0, half));
	}

}
