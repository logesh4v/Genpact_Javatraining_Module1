package oop;

public class BankAccount {
	private String accountHolderName;
	private String accountNumber;
	private double balance;
	//default constructor
	public BankAccount() {
	}
	//parameterised constructor - with parameters, no return type
	public BankAccount(String name, String accNum, double amt) {
		this.accountHolderName = name;
		this.accountNumber = accNum;
		this.balance = amt;
	}

	//Getter and Setter
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String name) {
		this.accountHolderName = name;
	}
	public void setAccountNum(String accNumber) {
		this.accountNumber = accNumber;
	}
	public void setBalance(double bal) {
		if(bal>0) {
			this.balance = bal;
		}
		else {
			this.balance = 0;
		}
	}

	//deposit balance
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Updated: " + balance);
	}
	//withdraw balance
	public void withdraw (double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("Updated balance: " + balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	//display details
	public void displayDetails() {
		System.out.println("Account no: " + accountNumber);
		System.out.println("Account name: " + accountHolderName);
		System.out.println("Balance: " + balance);
		System.out.println("------------------------");
 
	}
	//check balance
	public void checkBalance() {
		System.out.println("Account no: " + accountNumber);
		System.out.println("Balance: " + balance);
 
	}
 
}