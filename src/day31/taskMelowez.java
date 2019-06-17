package day31;

import java.util.Arrays;

public class taskMelowez {

	public static void main(String[] args) {
		// create a statice method called reportBiggerArray
		// it will take 2 parameter and both of them have type of int arrays as parameters 
		// inside body it will compare  the item count of 2 arrays
		// and print out array with bigger size
		// for example {1,2,3}    {1,2,3,4}
		// second array is bigger and print  [1,2,3,4]
		int[] num1 = {1,45,6};
		int[] num2 = {1,45,6,6};
		reportBiggerArray( num1 ,  num2);
		
			
		}
	
	public static void reportBiggerArray(int [] num1 , int [] num2) {
     if(num1.length > num2.length) {
    	 System.out.println(Arrays.toString(num1));
     }else {
    	 System.out.println(Arrays.toString(num2));
     }
	}

}
