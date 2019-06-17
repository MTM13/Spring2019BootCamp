package javaTest;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {

     String[] Kaltak = new String [4];
     Kaltak[0]= "little man";
     Kaltak[1]= "city angle";
     Kaltak[2]= "cast away";
     Kaltak[3]= "issue";
    	 System.out.print(Arrays.deepToString(Kaltak));
    	 
    	
    	 System.out.println(Kaltak.length);
    	 
    	 int max=0;
    	 for (int i = 0; i < Kaltak.length; i++) {
			if(Kaltak[i].length()>max) {
				max = Kaltak[i].length();
				
			}
		}
    	 System.out.println(max);
		
	}

	}


