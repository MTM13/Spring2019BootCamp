package day27;

import java.util.Arrays;
import java.util.Scanner;

public class taskaMaxMinSumForEachLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("give me 5 numbers");
		int sum = 0;
		int [] nums = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
		int max=nums[0];
		int min=nums[0];
		for(int all :   nums) {
			sum +=all;
			if(all > max) 
				max = all;
			if(all< min)
			min = all;
		}
		System.out.println("the sum of all numbers is "+ sum);
		System.out.println("the max nums is " + max);
        System.out.println("the min nums is " + min);
        
        
	}

}
