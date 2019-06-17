package day51;

public class AtTheTeller {

	public static void main(String[] args) {
		
		
		
		SavingAccount s = new SavingAccount("Ahmed Alkos", 64448421458L, 100254.21, 2.5);
		System.out.println(s.toString());
		s.Deposit(15);
		System.out.println("Current amount is " + s.balance);

	}

}
