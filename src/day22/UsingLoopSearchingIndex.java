package day22;

import java.util.Scanner;

public class UsingLoopSearchingIndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("give me a name");
		String Str = scan.next();
	
		for (int i = 0; i <= Str.length()-1; i++) {
			if(i!=Str.length()-1) {
			System.out.print(Str.substring(i,i+1)+"-");
			
		}else {
			System.out.print(Str.substring(i,i+1));
		}

	}

	}
}
