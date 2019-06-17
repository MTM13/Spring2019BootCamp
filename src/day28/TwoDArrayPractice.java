package day28;

public class TwoDArrayPractice {

	public static void main(String[] args) {
		int [][] data= {{1,2,3} , {4,5,6} ,{7,8,9} ,{10,11,12},{13,14,15} , {16,17,18} ,{19,20,21} ,{22,23,24}};
		int [][] tata= {{0,10,20} , {30,40,50} ,{60,70,80} ,{90,100,110},{120,130,140}};
		for(int [] bose :data) {
        	 for(int mtm :bose) {
        		 for(int[] dash:tata) {
        			 for(int hosh :dash) {
        				 System.out.print(mtm+" ");
        				 System.out.print(hosh+" ");
        		 
        			 }
        			 
        			 System.out.println();
        	 }
         }
	}

	}
}