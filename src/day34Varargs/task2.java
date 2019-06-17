package day34Varargs;

import java.util.Arrays;

public class task2 {

	public static void main(String[] args) {
		int[] []  twoDArrObj   ={ {2,3,7}  , {4,8,9} };
		//System.out.println(Arrays.deepToString(twoDArrObj));
         twoDPrinter(twoDArrObj);
	}
	public static void twoDPrinter(int [][] twoD) {
	
		
	//System.out.println(Arrays.deepToString(twoD));
	
		for(int[] eachArr    : twoD  )   {
			 
			for(int eachNums  :  eachArr  )  {
				System.out.print(eachNums+" ");
			}
			System.out.println();
		}
		
		
	}
}
