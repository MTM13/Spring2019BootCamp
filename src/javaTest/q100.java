package javaTest;

import java.util.Scanner;

public class q100 {

	public static void main(String[] args) { // Alhaneeeeeeeeeeeeeeeen  الحنين 
		Scanner scan = new Scanner(System.in);
		int prize = 0;
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		if (a == b && a == c && a == d) {
			prize = 30;
			System.out.println(prize);

		} else if ((a == b && b == c) || (a == d && d == c) || ( d == b && b == d) ) {

			prize = 20;
			System.out.println(prize);

		} else if ((a == b && !(d == c)) || (a == d && !(b == c)) || (a == c && !(b == d)) || (d == b && !(a == c))
				|| ((d == c) && !(a == b)) || ((b == c) && !(a == d))) {

			prize = 10;
			System.out.println(prize);
		} else {
			prize = 0;
			System.out.println(prize);
		}

	}

}
