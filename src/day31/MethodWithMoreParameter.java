package day31;

import java.util.Scanner;

public class MethodWithMoreParameter {
	public static void login(String word, String pass , boolean bozz) {
		
	
		login(word, pass, bozz);
		
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username ");
		String word = scan.next();
		System.out.println("Enter your password");
		String pass = scan.next();
		System.out.println("you want to remember you");
		boolean remember = scan.nextBoolean();
		if(word.equals("abc")&& (pass.equals("123") && (remember==true))) {
			System.out.println("bozz");
		}else if((word.equals("abc")&& (pass.equals("123") && (remember==false)))) {
			System.out.println("not bozz");
		}else {
			System.out.println("Do siga");
		}

	}

}
