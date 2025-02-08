package bank_test;
import java.util.*;

public class SavingsBankAccount extends BankAccount {
	
	    private double interestRate;
	 
	    // Default constructor
	    public SavingsBankAccount() {
	        super();
	    }
	 
	    // Parameterized constructor
	    public SavingsBankAccount(String name, String accNum, double amt, double intRate) {
	        super(name, accNum, amt);
	        this.interestRate = intRate;
	    }
	 
	    // Getter and setter for interest rate
	    public double getInterestRate() {
	        return interestRate;
	    }
	 
	    public void setInterestRate(double interestRate) {
	        this.interestRate = interestRate;
	    }
	 
	    @Override
	    public void deposit(double amount) {
	        super.deposit(amount);
	        double interest = amount * interestRate / 100;
	        setBalance(getBalance() + interest);
	        System.out.println("Interest added: " + interest);
	    }
	 
	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Interest rate: " + interestRate);
	        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	    }
	 
//	    // Method to calculate and display savings balance with interest
//	    public void displaySavingsBalance() {
//	        double totalBalance = getBalance() + (getInterestRate() * getBalance() / 100);
//	        System.out.println("Interest rate on this account: " + getInterestRate() + "%");
////	        System.out.println("Total balance: " + totalBalance);
//	    }
	 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	 
	        // Taking input from the user for SavingsBankAccount
	        System.out.print("Enter the name: ");
	        String name = sc.nextLine();
	 
	        System.out.print("Enter the account number: ");
	        String accNum = sc.nextLine();
	 
	        System.out.print("Enter the balance: ");
	        double amt = sc.nextDouble();
	 
	        double intRate;
	 
	        if (amt < 5000) {
	            intRate = 0;
	        } else if (amt >= 5000 && amt < 10000) {
	            intRate = 10;
	        } else {
	            intRate = 20;
	        }
	 
	        SavingsBankAccount savingAccount = new SavingsBankAccount(name, accNum, amt, intRate);
	 
//	        savingAccount.displaySavingsBalance();
	        savingAccount.displayDetails();
	        System.out.println("-");
	        savingAccount.deposit(1000);
	        System.out.println("-");
	        savingAccount.displayDetails();
	        sc.close();
	    }
	}
	

