package javaTest;

import java.util.Scanner;

public class Concatenation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		char lastIndex = word1.charAt(word1.length()-1);
		String lastChar = word1.substring( word1.length()-1);
		char firstChar = word2.charAt(0);
	    
	    
	if (firstChar == lastIndex) {
		System.out.println(word1.substring(0, word1.length()-1)+word2);
		}else {
			System.out.println(word1+word2);
		}

	}
	}
	


