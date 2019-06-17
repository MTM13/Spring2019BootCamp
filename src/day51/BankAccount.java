package day51;

public class BankAccount {
	
	
	/*
	 * Create a BankAccount class 
		fields : 
			accountName as String
			accountNumber as long 
			balance as double 

		Constructor 
			3 args constructor to set all above value 

		methods : 
			toString method
			deposit accept one int as parameter 
				and it changes the balance accordingly
			withdraw accept one int as parameter
				and it changes the balance accordingly

	Create a sub class called SavingAccount 
		field : 
			double returnRate
		Constructor 
			4 args constructor to set all above value 

		overriden methods : 
			toString method
			deposit accept one int as parameter 
				and it changes the balance accordingly
				but you get 100$ for each deposit 
			withdraw accept one int as parameter
				and it changes the balance accordingly
				but you get 10$ penalty for each withdraw 

	 */

	String accountName;
	long accountNumber;
	double balance;
	
	public BankAccount(String accountName, long accountNumber, double balance) {
		super();
		accountName = accountName;
		accountNumber = accountNumber;
		balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [AccountName=" + accountName +
				", AccountNumber=" + accountNumber + ", Balance=" 
				+ balance
				+ "]";
	}
	
	
	public void Deposit(int money) {
		this.balance +=money;
	}
	
	
	public void Withdraw(int money) {
		this.balance -=money;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
