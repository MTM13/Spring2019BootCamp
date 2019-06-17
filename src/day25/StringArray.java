package day25;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {


		String [] Movies = new String[4];
		Movies[0]= "Life";
		Movies[1]= "without";
		Movies[2]= "love is ";
		Movies[3]= "meaningless";
		System.out.println(Arrays.toString(Movies));
		System.out.println(Movies.length);
        // to get the location of the word with max length 
		// then just use that index to get the word
		
		int Index =0;
		// Iteration 1: --> 7>4 -----> max =7    Index =1
		// Iteration 2: --> 7>7 -----> max =7    Index =1
		// Iteration 3: --> 11>7 -----> max =11   Index =3 as location 
		int max = Movies[0].length();
		for (int i = 0; i < Movies.length; i++) {
			if(Movies[i].length()>max) {
				max = Movies[i].length();
                 Index=i;
			}

			System.out.println(Movies[i] + "  Char count is "+ Movies[i].length());
			System.out.println("The max length of movies is: "+ max); 
			System.out.println(Movies[Index]);
		}

	}

}
