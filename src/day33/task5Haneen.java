package day33;

import java.util.Arrays;

public class task5Haneen {
     // create a static method called combineArray
	//it takes two double array as parameters 
	//and return another double array with 2 array items combine
	public static void main(String[] args) {


		double x [] = {1.1,2.2,3.3};
		double y [] = {4.4,5.5,6.6};
		
     System.out.println(Arrays.toString(combineArray(x, y)));
	}
	public static double [] combineArray (double[] x ,double []  y ) {
	
		double [] combine = new double [x.length + y.length];
		for (int i = 0; i < x.length; i++) {
			combine[i] = x[i];
		}
		for (int j = 0; j < y.length; j++) {
			combine[x.length+ j] = y[j];
		}
		
		
		
		return combine;		
			}
	
	}

