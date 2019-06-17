package day34Varargs;

public class WarmUp$$$Tooooooooooooooop {
	/*
	 * write a method to test a string is a parameter static method called
	 * isPalindrome it takes one String as a parameter return boolean space does not
	 * matter
	 *  OPTIONALLY : Use your existing method called reserveString
	 */

	public static boolean isPalindrome(String word) {

		String reversed = "";
		word = word.replaceAll(" ", "");

		for (int i = word.length() - 1; i >= 0; i--) {

			reversed += word.charAt(i) + "";
		}

		return reversed.equals(word);

	}

	public static String reverseString(String word) {

		String reversed = "";

		for (int i = word.length() - 1; i >= 0; i--) {

			reversed += word.charAt(i) + "";
		}

		return reversed;

	}

	public static boolean isPalindrome2(String word) {

		String reversed = reverseString(word);
		word = word.replaceAll(" ", "");
		reversed = reversed.replaceAll(" ", "");

		return reversed.equals(word);

	}

	public static void main(String[] args) {

		System.out.println(isPalindrome2("hannah"));
		System.out.println(isPalindrome2("race car"));
		System.out.println(isPalindrome2("was it a car or a cat  i saw"));
		System.out.println(isPalindrome2("myname"));
   
	}

}