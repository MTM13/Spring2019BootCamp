package javaTest;

import java.util.Arrays;
import java.util.Scanner;
                                       // video of day 26 on 04/10/2019
public class taskday26tooooop {

	public static void main(String[] args) {


		Scanner scan =new Scanner(System.in);
		System.out.println("Enter name");
		String name=scan.next();
		System.out.println("Enter the Character ");
		String moti = scan.next();
		char myChar = moti.charAt(0);
		char [] MTM = name.toCharArray();
		System.out.println(Arrays.toString(MTM));
		int count = 0;
		for (int i = 0; i < MTM.length; i++) {
			if(MTM[i]==moti.charAt(0)) {
				count++;
			}
			
		}
		System.out.println("The count of ("+moti + ") is "+count);

	}

}
