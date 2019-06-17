package javaTest;

import java.util.Arrays;

public class shkabeet {

	public static void main(String[] args) {

  
		int[] Num= {1,4,6,8,9,5,152,45, 145,658, 2125};
		
		int count=0;
		for (int i = 0; i < Num.length; i++) {
			
			if(Num[i]>100) 
			count++;
		}
		System.out.print(count);

	}
}
