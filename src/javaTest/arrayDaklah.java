package javaTest;

import java.util.Arrays;

public class arrayDaklah {

	public static void main(String[] args) {


		int looz []= {1,4,6,8,9};
		looz[2] *=2;
		looz[3] = looz[0]+looz[1];
		for (int i = 0; i < looz.length; i++) {
			  
//			int temp = looz[0];   // swap with temp
//			looz[0]= looz[4];
//			looz[4]= temp;
			
			looz[0]= looz[0]+looz[4];    // swap without temp
			looz[4]=looz[0]-looz[4];
			looz[0]=looz[0]-looz[4];
			
			
			
		}
		System.out.println(Arrays.toString(looz));

	}

}
