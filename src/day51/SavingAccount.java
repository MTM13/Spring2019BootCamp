package day51;

public class SavingAccount extends BankAccount {

	
	double returnRate;
	
	public SavingAccount(String accountName, long accountNumber, double balance, double returnRate) {
		super( accountName, accountNumber, balance);
		this.returnRate = returnRate;
			
	}
	
	
	
	
	@Override
	public String toString() {
		return "SavingAccount [returnRate=" + returnRate + ", accountName=" + accountName + ", accountNumber="
				+ accountNumber + ", balance=" + balance + "]";
	}




	@Override
	public void Deposit(int money) {
		 this.balance += money + 100;
		 
	}
	
	@Override
	public void Withdraw(int money) {
		this.balance -= money -10;
		 
	}
	
}
