package javaTest;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		GiveMeLastChar("looz");
		String name ="Call Of Duty";
		
			 char [] myChars=name.toCharArray();
			
	
		

		System.out.println(Arrays.toString(myChars));
	}

	private static void GiveMeLastChar(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}

}
