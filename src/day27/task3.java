package day27;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers");
		int[] nums = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
		
		int sum=0;
        for ( int all  :    nums) {
        sum += all;
        }
        System.out.println(sum);
	}

}
