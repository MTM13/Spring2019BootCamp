package day33;

import java.util.Scanner;

public class task {
/*
 * create a static method getSum accept 1 parameter 
 * and return the sum of all the items in array
 * 
 */

	public static void main(String[] args) {

		System.out.println("give number to get the sum ");
		Scanner scan = new Scanner(System.in);
		int[] nums = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};

		int sum = getSumOf(nums);
		System.out.println(sum);
	}
	
	public static int getSumOf(int [] x) {
		int sum =0;
		for (int each  :   x) {
			
			sum = sum + each;
		}
		
		return sum;
	}
	
	
	
	

}
