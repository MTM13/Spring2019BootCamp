package javaTest;

import java.util.Scanner;

public class q23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the patient portal!");
		System.out.println("Please enter your personal information");
		System.out.println("Enter your first name");
		String FirstName = scan.next();
		System.out.println("Enter your last name");
		String LastName = scan.next();
		System.out.println("Enter your email");
		String Email = scan.next();
		System.out.println("Enter your street");
		int StreetNum = scan.nextInt();
		String Street = scan.nextLine();
		System.out.println("Enter your city");
		String City = scan.next();
		System.out.println("Enter your state");
		String State = scan.next();
		System.out.println("Enter your zip code");
		int ZipCode = scan.nextInt();
		System.out.println("Enter your work phone number");
		long WorkPhoneNumber = scan.nextLong();
		System.out.println("Enter your personal phone number");
		long PersonalPhoneNumber = scan.nextLong();
		System.out.println("Enter your age");
		int Age = scan.nextInt();
		System.out.println("Enter your height");
		double Height = scan.nextDouble();
		System.out.println("Enter your weight");
		double Weight = scan.nextDouble();
		System.out.println("Are you married?");
		boolean Married = scan.hasNext();
		System.out.println("Patient personal information");
		System.out.println("Full name: " + LastName + ", " + FirstName);
		System.out.println("" + "Address:" + " "+StreetNum+Street + ", " +City + ", " + State + " " + ZipCode);
		System.out.println("Contacts: " + "work " + "phone " + "number - " + WorkPhoneNumber + ", " + "personal "
				+ "phone " + "number - " + PersonalPhoneNumber + ", " + "email: " + Email);
		System.out.println("Age: "+Age);
		System.out.println("Height: "+Height);
		System.out.println("Weight: "+Weight+" pounds");
		System.out.println("Married?: "+Married);

	}

}
