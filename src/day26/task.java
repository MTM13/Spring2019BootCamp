package day26;

import java.util.Arrays;

public class task {

	public static void main(String[] args) {
		// create a string called groceries
		//add items separated by comma
		//split them and print them out
		//find out the size of split
		//find out the length of each items
		String groceries = "tomatos , potatoes, " 
				+"Aubergine , cucumber ,cabbage" ;
        String[] item = groceries.split(",");
        for (int i = 0; i < item.length; i++) {
        	System.out.println(item[i].trim());
        	System.out.println( "the length is "+item[i].length());
		}
	}

}
