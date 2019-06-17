package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachLoopPractice {

	public static void main(String[] args) {


		// Ask user a word
		//turn that word into charArray
		//then print out using for each loop
		// cybertek ------>c-y-b-e-r-t-e-k-
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word");
		String word = scan.next();
		char [] bostok = word.toCharArray();
for (char mooz : bostok) {
	System.out.print(mooz+"-");
	}
}

}
