package javaTest;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word  = scan.next();
		int lastchar = word.length()-1;
		char firstchar = word.charAt(0);
		String  middle = word.substring(1,word.length()-1);
		System.out.println(word.charAt(lastchar)+middle+ firstchar);
		
	}

}
