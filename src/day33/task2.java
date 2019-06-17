package day33;

import java.util.Scanner;

public class task2 {
      /*
       * create a method called get the max accept 1 parameter 
       * as int array and return the max
       * from all the items in array
       */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give me numbers to get the max ");
		Scanner scan = new Scanner(System.in);
		int[] nums = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
     int max = getTheMax(nums);
     
      System.out.println(max);
	}
   
	public static int getTheMax(int [] nums) {
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(max < nums[i]) {
				max = nums[i];
			}
		}
		return max ; 
	}
	
	
}
