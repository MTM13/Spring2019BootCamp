package javaTest;

import java.util.Arrays;

public class wffwfw {
	/*
	 * create static a method called
	 * getArrayFrom1toX
	 * it takes one parameter
	 * and return array starting from 1 to the number specified
	 *  getArrayFrom1toX -----> {1,2,3,4,5}
	 */
	public static void main(String[] args) {
		int x =5;
		
			System.out.println(Arrays.toString(getArrayFrom1toX(x)));
		}
	public static int [] getArrayFrom1toX(int x) {
		int[] arr = new int [x];
		for (int i = 0; i < arr.length ; i++) {
			arr[i] = i+1;
			
		
		}
		return arr;		
		
	}

}
