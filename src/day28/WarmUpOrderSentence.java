package day28;

import java.util.Arrays;

public class WarmUpOrderSentence {

	public static void main(String[] args) {
		String Str = "Sunday perfect Day to start coding";
		           // coding-start-to-Day-perfect-Sunday
		String [] form = Str.split(" ");
		System.out.println(Arrays.toString(form));
		int LastIndex = form.length-1;
		for (int i = LastIndex; i >= 0; i--) {
			if(i == 0) 
				System.out.print(form[i]+" ");
			else
		 System.out.print(form[i]+"-");
//--------------------------------------------------------
      /*another way to reverse
       * String StrRev ="";
       * int LastIndex = form.length-1;
       * for(int i =0; i<form.length/2;i++){
       * String temp = form[i];
       * form[i]=form[LastIndex-i];
       * form[LastIndex-i] =temp;
       * }
       * System.out.println(Arrays.toString(form));
       */
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}
