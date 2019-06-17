package javaTest;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUpDay27 {

	public static void main(String[] args) {
// //Task1 : 
//create an array of int with 5 items , return true if all items are more than 10
//	return false if not
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 5 numbers");
    int [] numbers = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
   boolean result = true;
    for (int i = 0; i < numbers.length; i++) {
		if(numbers[i]<=10) {
			result=false;
			break;
		
		   }
		}
    System.out.println(Arrays.toString(numbers));
    System.out.println(result);
    	
	
	}
     }


