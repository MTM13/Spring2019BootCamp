package javaTest;

import java.util.Arrays;

public class WarmUp {

	public static void main(String[] args) {

    int [] count = new int [50];
    for (int i = 0; i < count.length; i++) {
    	count[i]=i+1;

	}
    System.out.print(Arrays.toString(count));

	}

}
