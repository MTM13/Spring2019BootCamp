package javaTest;

import java.util.*;

public class khaltak {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float [] score = new float[7];
		 for (int i = 0; i < score.length; i++) {
			 System.out.println("Enter score for judge"+(i+1)+ ":");
			 score[i]=scan.nextFloat();
			 if(!(score[i]>=0) || (score[i] >10)) {
				 System.out.println("error");
				 break;
			 }
			
		}
		 
         float sum= 0;
        for(int i = 1; i<score.length-1; i++){
          
      sum+=score[i];
      
        }
        System.out.println("Enter difficulty:");
        float dif= scan.nextFloat();
        float total = sum*dif;
        if((dif > 3.8) || (dif< 1.2 )) {
        	total *=.6;
        	System.out.println("error");
        }else {
        
       
        System.out.println("Total: "+total);
	}
	}
}
//------------------------------------------------------------------
//
//System.out.println("Enter score for judge "+ (i+1)+":");
//score[i]=input.nextFloat();
//
//   }
//   Arrays.sort(score);
//   float sum= 0;
//  for(int i = 1; i<score.length-1; i++){
//    
//sum+=score[i];
//
//  }
//  System.out.println("Enter difficulty:");
//  float dif= input.nextFloat();
//  float total = sum*dif;
//  total *=.6;
//
//
//// FINAL OUTPUT
//System.out.println("Total: "+total);
//}
//}