package oops;
 
public class BankAccount {
 
	// data field -> members,instance,properties
	private String accountHolderName;
	private String accountNumber;
	public double balance;
	//behaviour - method -instance method
	// defaulr constructor - constructor overloading
	//public BankAccount() { }
	//parametrized constructor - with parameter - no return type
	public BankAccount(String name,String accNum,double amt) {
		this.accountHolderName=name;
		this.accountNumber=accNum;
		this.balance = amt;
	}
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	//getter /setter
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String name) {
		 this.accountHolderName = name;
	}
	public String getaccountNumber() {
		return accountNumber;
	}
	public  void setaccountNumber(String accNum) {
		 this.accountNumber = accNum;
	}
	public double getbalance() {
		return balance;
	}	
	public void setbalance(double balance) {
		 this.balance = balance;
	}
	//deposit
	public void deposit(double amount) {
		 balance +=amount;
		 System.out.println("Updated balance: "+balance);
	}
	// method overloading concepts
	public void deposit(double... amounts) { // deposting multiple checks - array of amounts
		//check 1,2,3
		//total amount ->deposit ->add up all amt
		//add it to balance
		double totalDeposit =0.0;
		//for loop
		for(double amount : amounts) {
			if(amount >0) {
			totalDeposit +=amount;
			}
			else {
				System.out.println("Negative amount is not permissible");
			}
		}
		balance += totalDeposit;
		System.out.println("Updated balance :" +balance);
	}
	//test in bankapplication ->diff values 
	//override this deposit in childclass -> total deposit + interest = total balance
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
	
	
	
	//to string--converting the object into its string rep
	
	
	@Override
	public String toString() {
		return "BankAccount [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", balance="
				+ balance + "]";
		
	}
	public void displayDetails() {
 
		System.out.println("Account Holder Name :"+accountHolderName);
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Account Balance :"+balance);
		System.out.println("____________________________");
	}
	public void transfer(double amount,BankAccount targetAccount) { // obj  type parameter
	  if(amount <=0) {
		  System.out.println("Amount Should be Positive Value");
	  }
	  else if (amount > balance) {
		  System.out.println("Insufficient Balance");
	  }
	  //actual transfer
	  //call transfer method from source obj ->p1
	  //p1 ->p2
	  //p1 balance should be sub 
	  else {
	  balance -=amount;
	  // should get deposited to p2
	  targetAccount.deposit(amount);
	  System.out.println("Transfered  Amount : "+amount+"to account: "+targetAccount.getaccountNumber());
	  }
	}
	//checkbalance
	public void checkBalance(){
		System.out.println("Account number: "+ accountNumber);
		System.out.println("Updated balance: "+balance);		
	}
}