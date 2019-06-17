package day26;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		String shows = "Orville, Game Of Throne, X-man, Gifted, Breaking-bad";
         String [] sharpArray = shows.split(", ");
         System.out.println(Arrays.toString(sharpArray));
         for (int i = 0; i < sharpArray.length; i++) {
			System.out.println(sharpArray[i]);
		}
         System.out.println("--------------------------------------------");
         System.out.println(sharpArray[3]+", "+sharpArray[sharpArray.length-1]);
	}

}
