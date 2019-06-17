package day27;

import java.util.Arrays;

public class WarmUpTask2 {

	public static void main(String[] args) {


		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		String [] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		
		for (int i = 0; i < words.length; i++) {
		//	System.out.println(words[i]);
			String one = words[i]; // C-y-
			char [] CyberChar = one.toCharArray();
			for (int j = 0; j < CyberChar.length; j++) {
				System.out.print(CyberChar[j]+"-");
		}
        	System.out.println();
			
		}
	}

}
