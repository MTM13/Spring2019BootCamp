package day27;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUp {
	public static void main (String[]  args) {
		// //Task1 : 
		//create an array of int with 5 items , return true if all items are more than 10
//			return false if not
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

		//----------------------------------------------------------------
//		//Task1 : 
//		//create an array of int with 5 items , return true if all items are more than 10
//	    //return false if not
//
//		int [] num = {25,18,13,11,53,67};
//		//print true if all are numbers are more than 10 
//		//print false if not
//		//print false as long as one number are false
//		boolean result = true;
//		for (int i = 0; i < num.length; i++) {
//			if(num[i]<=10) {
//				result=false;
//				break;
//			}
////			if(num[i]>10) {
////				System.out.println("true");
////			}else {
////				System.out.println("false");
////			}
//			}
//		System.out.println(result);
//		
//	}
//
//}
