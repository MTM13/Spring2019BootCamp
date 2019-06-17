package day38;

import java.util.ArrayList;

public class ArrayListPractice4 {

	public static void main(String[] args) {
		ArrayList<Integer> lst1 = new ArrayList<>();
	    for(int i=1; i<=5; i++) {
	      lst1.add(i);
	    }
	    System.out.println(  lst1  );    
	    
	    ArrayList<Integer> lst2 = new ArrayList<>();
	    for (int i = 6; i > 0; i--) {
	      lst2.add(i);
	    }
	    System.out.println(lst2);
	  
	    //// addAll method of ArrayList class 
	    
	    lst1.addAll(lst2) ; 
	    System.out.println( lst1 );
	    
	    
	  }

}
