package day22;

import java.util.Scanner;

public class AllToLowerCase$ {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your statement");
	    String str = scan.nextLine();
	    String AllLowerCase = "";
	    for (int i = 0; i < str.length(); i++) {
	    	char eachChar = str.charAt(i);
	    	if(eachChar >= 'a'  && eachChar <= 'z') {
	    	AllLowerCase += eachChar;
	    	
			
		}
	}
	System.out.println(AllLowerCase);

}
}