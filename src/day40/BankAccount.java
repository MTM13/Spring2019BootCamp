package day40;

public class BankAccount {
	
	// 2 instance variable/fields  
	  String accountHolder; 
	  double balance;
	  
	  
	  // create an instance method(non-static method)
	  // called showAccountHolder --> printOut Account Holder name
	  public void showAccountHolder() {
		  System.out.println("Account holder name is: "+accountHolder);
	  }

	  // create an instance method showBalance and print out the balance 
	  public void showBalance() {
		  System.out.println("Account balance: "+balance);
	  }
	  // OPTIONAL 
	  // create an instance method called add100Dollar does not accept any paramters 
	  // and return no value 
	  // increase the balance of the account by 100 ; 
	  public void add100Dollar() {
		  balance = balance + 100 ;
	  }
	  // adding custom amout dollar to current balance
	  public void addDollar(int amount) {
		balance = balance+ amount;  
	  }
	  
	  // Create another class called BankActivity with main method 
	  // create bank account object 
	  // set account holder name and balance value 
	  // call your showAccountHolder and showBalance method
	  
	  // OPTIONALLY CALL YOUR add100Dollar 
	  // and call your showBalance method again to see whether balance has changed 
	  
	}