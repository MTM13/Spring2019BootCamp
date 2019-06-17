package day32;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {


		int CM = 100;
		int meter  ;
		Scanner scan = new Scanner(System.in);
		meter = scan.nextInt();
		//MeterToCM(0);
		
		System.out.println(meter * CM+" cm");
	}
	public static int  MeterToCM(int meter) {
		
		
		return meter/100 ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
