package javaTest;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		String alex = "post malon tyga siga";
		String[] each = alex.split(" ");
		String empty="";
      for (int j = 0; j < each.length; j++) {
		
		String one = each[j];
		char[] wordChar = one.toCharArray();
		int lastIndex = wordChar.length - 1;

		for (int i = 0; i < wordChar.length / 2; i++) {

			char temp = wordChar[i];
			wordChar[i] = wordChar[lastIndex - i];
			wordChar[lastIndex - i] = temp;
		}

		//System.out.println(Arrays.toString(wordChar));
		String newOne = new String(wordChar);
		empty +=newOne+" ";
      }
      System.out.println(empty);

	}

}
