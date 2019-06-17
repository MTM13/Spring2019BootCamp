package day35;

public class WarmUp {
	/*
	 * create a static method called findLongestWord
	 * this method have one parameter as string vararg
	 * and return the longest word as string
	 */
	public static String findLongestWord(String...str ) {
		
		String longestWord = "";
		for (int i = 0; i < str.length; i++) {
			if (longestWord.length() < str[i].length()) {
				longestWord = str[i];
				
				
			}
		}
		System.out.println(longestWord);
		return longestWord;
	}
	

	public static void main(String[] args) {

		findLongestWord("ahmed", "looz", "jakooj","lafta", "khaltak" );
		

	}

}
