package day33;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		System.out.println("give names to get them all ");
		Scanner scan = new Scanner(System.in);
		String [] names = {scan.next(),scan.next(),scan.next(),scan.next()};
		 
		String conResult = addAll(names);
		System.out.print(conResult);

	}
	public static String addAll(String [] strs) {
		String concatenation = "";
		for (int i = 0; i < strs.length; i++) {
			concatenation += strs[i];
		}
		return concatenation;
		
		
		
		
		
		
	}
}
