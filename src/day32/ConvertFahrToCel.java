package day32;

import java.util.Scanner;

public class ConvertFahrToCel {

	public static void main(String[] args) {
		  
        
		Scanner scan = new Scanner(System.in);
		double fahr = scan.nextDouble();
		System.out.println(FahrToCel(fahr));
	}
     public static double FahrToCel(double fahr) {
    	 return (fahr-32)*5/9;
    }
}
