package day24;

import java.util.Scanner;

public class AskUserForNumberAndGetTheMax {

	public static void main(String[] args) {
		
		int [] moti = new int[5];
		Scanner scan = new Scanner(System.in);
		
		int max = moti[0];
		for (int i = 0; i < moti.length; i++) {
			System.out.println("Enter number "+ (i+1));
			moti[i]=scan.nextInt();
			if(moti[i]>max) {
				max = moti[i];
			}
		}
       System.out.println("the max number that you enter it is:"+ max);
	}

}
