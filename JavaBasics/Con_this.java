package JavaBasics;

public class Con_this {

	public class Bankaccount {
		//data-fields-data members-instance members-properties
		String accountHolderName;
		String accountNumber;
		double balance;
		//behaviour - methods-instance methods
		//deposit
		//default constructor-constructor overloading
		public Bankaccount() {
			this.accountHolderName="unknown";
			this.accountNumber="00000";
			this.balance=0.0;
		}
		//parameterised constructor - with parameters - no return type
		public Bankaccount(String name,String accNum,double amt) {
			this.accountHolderName=name;
			this.accountNumber=accNum;
			this.balance=amt;
		}
		public void deposit(double amount) {
			balance += amount;
			System.out.println("Updated balance: "+balance);
		}
		//withdraw
		public void withdraw(double amount) {
			if(balance>=amount) {
				balance -= amount;
				System.out.println("Updated balance: "+balance);
			}
			else {
				System.out.println("Insufficient balance");
			}
		}
		public void checkBalance() {
			System.out.print("account number: "+accountNumber);
			System.out.print(" has current balance: "+balance);
		}
	}
}
