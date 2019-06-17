package day22;

import java.util.Scanner;

public class q96 {

	public static void main(String[] args) {
		  
		Scanner scan = new Scanner(System.in);
		System.out.println("number of population");
		int numOfPopulation = scan.nextInt();
		int x =0;
		int dayCount = numOfPopulation;
		while (dayCount>0) {
			System.out.println("Day "+ x + " ["+dayCount+"]");
			x++;
			dayCount =dayCount/2;
		}
System.out.println("----EXTINCT----");
	}

}
