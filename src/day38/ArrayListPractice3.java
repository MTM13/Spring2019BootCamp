package day38;

import java.util.ArrayList;

public class ArrayListPractice3 {

	public static void main(String[] args) {
		/* OPTIONAL 
	     * Combine above 2 lists -- add everything from 2nd list to first one
	     * 
	     * Update every odd items to 0 ; 
	     * 
	     * */
	    ArrayList<Integer> lst1 = new ArrayList<>();
	    // adding 1-100 to the list 
	    for(int i=1; i<=100; i++) {
	      lst1.add(i);
	    }
	    System.out.println(  lst1  );
	    
	    
	    ArrayList<Integer> lst2 = new ArrayList<>();
	    // adding 1-100 to the list 
	    
	    for (int i = 100; i > 0; i--) {
	      lst2.add(i);
	    }
	    System.out.println(lst2);
	    
	    // the logic is : pick each and every item in lst2 and add  to lst1
	    for (int i = 0; i < lst2.size(); i++) {
			lst1.add(lst2.get(i));
			
		}
	    System.out.println(lst1);
	    
	  }

	}
