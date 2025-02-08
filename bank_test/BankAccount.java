package bank_test;

public class BankAccount {
	 
	    private String accountHolderName;
	    private String accountNumber;
	    private double balance;
	 
	    // Default constructor
	    public BankAccount() {
	    }
	 
	    // Parameterized constructor
	    public BankAccount(String name, String accNum, double amt) {
	        this.accountHolderName = name;
	        this.accountNumber = accNum;
	        this.balance = amt;
	    }
	 
	    // Getter and setter methods for encapsulation
	    public String getAccountHolderName() {
	        return accountHolderName;
	    }
	 
	    public void setAccountHolderName(String name) {
	        this.accountHolderName = name;
	    }
	 
	    public String getAccountNumber() {
	        return accountNumber;
	    }
	 
	    public void setAccountNumber(String acc) {
	        this.accountNumber = acc;
	    }
	 
	    public double getBalance() {
	        return balance;
	    }
	 
	    public void setBalance(double bal) {
	        this.balance = bal;
	    }
	 
	    // Method to display account details
	    public void displayDetails() {
	        System.out.println("");
	        System.out.println("Account Name: " + getAccountHolderName());
	        System.out.println("Account Number: " + getAccountNumber());
	        System.out.println("Account Balance: " + getBalance());
//	        System.out.println("");
	    }
	 
	    // Method to deposit amount
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Updated balance is: " + balance);
	        
	    }
	 
	    
	    
	    //method overloading concept
	    public void deposit(double...amounts)
	    {
	    	double totalDeposit=0.0;
	    	//check1,check 2...check 4
	    	//total amount >deposit>add up all amounts
	    	//add to balance
	    	//loop enc
	    	
	    	for (double amount:amounts)
	    	{
	    		if(amount>0)
	    		{
	    			totalDeposit+=amount;
	    		}
	    		else
	    		{
	    			System.out.println("Negative amount is not permissible");
	    		}
	    	}
	    	balance+=totalDeposit;
	    	System.out.println("Updated balance"+balance);
	    }
	    
	    
	    
	    
	    
	    // Method to withdraw amount
	    public void withdraw(double amount) {
	        if (balance <= 0) {
	            System.out.println("Insufficient balance");
	        } else {
	            balance -= amount;
	            System.out.println("Updated balance is: " + balance);
	        }
	    }
	 
	    // Method to check balance
	    public void checkBalance() {
	        System.out.println("Account number " + accountNumber + " has current balance: " + balance);
	    }
	}

