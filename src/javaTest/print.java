package javaTest;

import java.util.Scanner;

public class print {
     
	public static void login(String username, String password, boolean remeberMe) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username ");
			 username = scan.next();
			 System.out.println("Enter your password ");
			 password = scan.next();
			 System.out.println("You want to remember you?");
			 remeberMe = scan.hasNext();
			 if (username.equals("abc")  && password.equals("123")  ) {
				 System.out.println("login seccess");
				 System.out.println("your account was saved");
			}else if (remeberMe==false) {
		
				System.out.println("your account was not saved");
				System.out.println("login seccess");
			}else {
				System.out.println("invalid data go do siga ");
			}
			
		
	}
	
	public static void main(String[] args) {
   String username= null ; 
   String password = null;
login(username, password,  false);
	}
		

	}


