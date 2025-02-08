/*package bank_test2;


public class BankAccount {
	    private String accountHolderName;
	    private String accountNumber;
	    protected double balance;

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
	        
	        
	    }
	    
	    
	    public void transfer (double amount,BankAccount targetAccount) {
	    if(amount<=0)
	    {
	    	
	    }
	    else if(amount>balance)
	    {
	    	
	    }
	    
	    else {
	    	balance=amount;
	    	targetAccount.deposit(amount);
	    	System.out.print("Transfer amount"+amount+"To account"+targetAccount.getAccountHolderName());
	    }
	    }



	    // Method to deposit amount
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Updated balance is: " + balance);
	    }

	    // Method overloading concept
	    public void deposit(double... amounts) {
	        double totalDeposit = 0.0;
	        for (double amount : amounts) {
	            if (amount > 0) {
	                totalDeposit += amount;
	            } else {
	                System.out.println("Negative amount is not permissible");
	            }
	        }
	        balance += totalDeposit;
	        System.out.println("Updated balance: " + balance);
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


*/








package bank_test2;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    protected double balance;
	private double interestRate;

    // con
    public BankAccount() {
    }

    
    public BankAccount(String name, String accNum, double amt,double interestRate) {
        this.accountHolderName = name;
        this.accountNumber = accNum;
        this.balance = amt;
    }

  
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

   
    public void displayDetails() {
        System.out.println("");
        System.out.println("Account Name: " + getAccountHolderName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Balance: " + getBalance());
    }

   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Updated balance is: " + balance);
    }

   
    public void deposit(double... amounts) {
        double totalDeposit = 0.0;
        for (double amount : amounts) {
            if (amount > 0) {
                totalDeposit += amount;
            } else {
                System.out.println("Negative amount is not permissible");
            }
        }
        balance += totalDeposit;
        System.out.println("Updated balance: " + balance);
    }

   
    public void withdraw(double amount) {
        if (balance <= 0) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Updated balance is: " + balance);
        }
    }

    //check balance
    public void checkBalance() {
        System.out.println("Account number " + accountNumber + " has current balance: " + balance);
    }

    // one account to different acc
    public void transfer(double amount, BankAccount targetAccount) {
        if (amount <= 0) {
            System.out.println("Transfer amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance for transfer.");
        } else {
            balance -= amount;
            targetAccount.deposit(amount);
            System.out.println("Transferred amount " + amount + " to account " + targetAccount.getAccountHolderName());
        }
    }
}



/*

package bank_test2;
 
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
//        System.out.println("");
    }
 
    // Method to deposit amount
    public void deposit(double amount) {
        balance += amount;
//        System.out.println("Updated balance is: " + balance);
    }

    // method over loading
    public void deposit(double... amounts) {
    	double totalDeposit = 0.0;
    	for(double amount: amounts) {
    		if(amount > 0) {
    			totalDeposit += amount;
    		}
    		else {
    			System.out.println("Negative Amount is not permissible");
    		}
    	}
    	balance += totalDeposit;
    	System.out.println("Updated Balance: " + balance);
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


    public void transfer(double amount, BankAccount targetaccount) {
    	if(amount<= 0) {
    		System.out.println("Amount to transfer: " + amount);
    		System.out.println("Transfer not possible");
    	}
    	else if(amount>balance) {
    		System.out.println("Amount to transfer: " + amount);
    		System.out.println("Not enough balance!");
    	}
    	else {
    		balance -= amount;
    		targetaccount.deposit(amount);
    		System.out.println("Transfered amount " + amount + " to account " + targetaccount.getAccountNumber());
    	}
    }
 
} */