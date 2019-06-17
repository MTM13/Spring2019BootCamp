package day22;

import java.util.Scanner;

public class UniqueString {

	public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Looking for unique ??");
    String inputFromUser = scan.next();
    String UniqueString = "";
    for (int i = 0; i < inputFromUser.length(); i++) {
		String EachChar= inputFromUser.substring(i, i+1);
		if(!  UniqueString.contains(EachChar)) {
			UniqueString += EachChar;
			System.out.print(EachChar +", ");
		}
	}
    
    

	}

}
