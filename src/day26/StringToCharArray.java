package day26;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		String str = "Spartan";
		int size = str.length();
		char[] myChars = new char[size];
		for (int i = 0; i < myChars.length; i++) {
			myChars[i] = str.charAt(i);

		}
		System.out.println(Arrays.toString(myChars));
// toCharArray method is method from string class 
		// and it will take no external data when being called
		// and it will return character array that have each char of string object

		//char[] myChars = str.toCharArray();
	//	System.out.println(Arrays.toString(myChars));
	}

}
