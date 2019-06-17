package day40;

public class BankActivityClass {

	public static void main(String[] args) {
		 
		
		BankAccount costumer1 = new BankAccount();
		costumer1.accountHolder = "Ashraf";
		costumer1.balance = 29564.11;
		
		costumer1.showAccountHolder();
		costumer1.showBalance();
		costumer1.add100Dollar();
		costumer1.addDollar(10000);
		costumer1.showBalance();
		
		System.out.println("---------------------------------------------------");
		
		BankAccount costumer2 = new BankAccount();
		costumer2.accountHolder = "looz";
		costumer2.balance = 2500;
		
		costumer2.showAccountHolder();
		costumer2.showBalance();
		costumer2.add100Dollar();
		costumer2.showBalance();
		
		
		
		
	}

}
