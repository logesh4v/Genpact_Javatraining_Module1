package JavaBasics;

public class Con_overload {
	 
		// data field -> members,instance,properties
		String accountHolderName;
		String accountNumber;
		double balance;
		//behaviour - method -instance method
		// defaulr constructor - constructor overloading
		public BankAccount() 
		{
			
		}
		//parametrized constructor - with parameter - no return type
		public BankAccount(String name,String accNum,double amt) {
			this.accountHolderName=name;
			this.accountNumber=accNum;
			this.balance = amt;
		}
		//deposit
		public void deposit(double amount) {
			 balance +=amount;
			 System.out.println("Updated balance: "+balance);
		}
		//withdraw
		public void withdraw(double amount) {
			if(balance >=amount) {
				balance -=amount;
				System.out.println("Updated balance: "+balance);
			}
			else {
				System.out.println("Insufficent balance");
			}
		}
		//checkbalance
		public void checkBalance(){
			System.out.println("Account number: "+ accountNumber);
			System.out.println("Updated balance: "+balance);		
		}
}