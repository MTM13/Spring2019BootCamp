package day33;

import java.util.Arrays;

public class giveMeAnArray {

	public static void main(String[] args) {
		 
		int [] myArray = giveMeAnArray();
       System.out.println(Arrays.toString(myArray));
       
       // calling in one shot
       System.out.println(Arrays.toString(giveMeAnArray()));
	}
	//this method have no parameter
	// and return int array object as returned value
	public static int[] giveMeAnArray() {
		int [] arr = new int []{1,2,3};
		return arr;
		
	}
}
