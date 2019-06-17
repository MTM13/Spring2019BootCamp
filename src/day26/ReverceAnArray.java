package day26;

import java.util.Arrays;

public class ReverceAnArray {

	public static void main(String[] args) {
           //reverse this array so the value of numbers array
		//will be reverse order
                       //{15,4,7,39,2,11}        
		int [] numbers = {11,2,39,7,4,15};
		for (int i = 0; i < numbers.length/2; i++) {
			int lastIndex = numbers.length-1;
			int temp = numbers[i];
			numbers[i]=numbers[lastIndex-i];
			numbers[lastIndex-i]= temp;
			
			
		}
		

		System.out.println(Arrays.toString(numbers));
	}

}
