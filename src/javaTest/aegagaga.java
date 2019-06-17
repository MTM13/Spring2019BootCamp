package javaTest;

public class aegagaga {
	/*
	 * write a method to test a string is a parameter
	 * static method called isPalindrome
	 * it takes one String as a parameter
	 * return boolean
	 * space does not matter
	 */
	public static boolean isPalindrome(String target) {
		String reversed = "";
		target = target.replace(" ", "");
		
		for (int i = target.length()-1 ; i >= 0 ;  i--) {
//			System.out.println(target.charAt(i));
			reversed += target.charAt(i);
			 
		}
		if(reversed.equals(target)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		
		System.out.println(isPalindrome("lool"));
		System.out.println(isPalindrome("nna"));
		System.out.println(isPalindrome("awga"));

	}

}
