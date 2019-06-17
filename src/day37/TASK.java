package day37;

import java.util.ArrayList;

public class TASK {

	public static void main(String[] args) {
		/*
		 * Create Array List of Double
		 * call it priceList 
		 * add 5 items 
		 * try to get 3rd items
		 * iterate over arraylist using both loops
		 * and print out
		 * in another loop
		 * only print out price more than 10
		 * 
		 */
            ArrayList<Double> priceList = new ArrayList<>();
            priceList.add(2.33);
            priceList.add(1.99);
            priceList.add(7.95);
            priceList.add(19.11);
            priceList.add(11.1);
//            System.out.println(priceList);
            
            for (int i = 0; i < priceList.size(); i++) {
				
            	System.out.print(priceList.get(i)+" ");
			}
            System.out.println();
            for(Double    each  :  priceList) {
            	if(each>10.0) {
            		System.out.println(each);
            	}
            }
            System.out.println();
            System.out.println(priceList.get(2));
            
		
		
		
		
	
	}

}
