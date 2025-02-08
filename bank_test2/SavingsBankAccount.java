/*package bank_test2;
import java.util.*;

public class SavingsBankAccount extends BankAccount {
    private double interestRate;

    
    public SavingsBankAccount() {
        super();
    }

   
    public SavingsBankAccount(String name, String accNum, double amt, double intRate) {
        super(name, accNum, amt);
        this.interestRate = intRate;
    }

    
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
    public void deposit(double... amounts) {
        double totalDeposit = 0.0;
        for (double amount : amounts) {
            if (amount > 0) {
                totalDeposit += amount;
                double interest = amount * interestRate / 100;
                setBalance(getBalance() + interest);
                System.out.println("Interest added for " + amount + ": " + interest);
            } else {
                System.out.println("Negative amount is not permissible");
            }
        }
        setBalance(getBalance() + totalDeposit);
        System.out.println("Updated balance: " + getBalance());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest rate: " + interestRate);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


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

        savingAccount.displayDetails();
        System.out.println("--------");
        savingAccount.deposit(1000);
        System.out.println("------");
        savingAccount.displayDetails();

        System.out.println("----------");
        savingAccount.deposit(-200, 3000);
        System.out.println("----------");
        savingAccount.displayDetails();

        sc.close();
    }
}
*/





package bank_test2;
import java.util.*;

public class SavingsBankAccount extends BankAccount {
    private double interestRate;

    // Default constructor
    public SavingsBankAccount() {
        super();
    }

    // Parameterized constructor
    public SavingsBankAccount(String name, String accNum, double amt, double interestRate) {
        super(name, accNum, amt,interestRate);
        this.interestRate = interestRate;
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
        if (amount > 0) {
            super.deposit(amount);
            double interest = amount * interestRate / 100;
            setBalance(getBalance() + interest);
            System.out.println("Interest added: " + interest);
        } else {
            System.out.println("Negative amount is not permissible");
        }
    }

    // Overloaded deposit method
    @Override
    public void deposit(double... amounts) {
        double totalDeposit = 0.0;
        for (double amount : amounts) {
            if (amount > 0) {
                totalDeposit += amount;
                double interest = amount * interestRate / 100;
                setBalance(getBalance() + interest);
                System.out.println("Interest added for " + amount + ": " + interest);
            } else {
                System.out.println("Negative amount is not permissible");
            }
        }
        balance += totalDeposit;
        System.out.println("Updated balance: " + getBalance());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest rate: " + interestRate);
        System.out.println("----------------------------------------------");
    }

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

        SavingsBankAccount savingAccount1 = new SavingsBankAccount(name, accNum, amt, intRate);

        // test account for testing the transfer the cash
        SavingsBankAccount savingAccount2 = new SavingsBankAccount("mohan", "123456789", 2000, 10);

        savingAccount1.displayDetails();
        savingAccount2.displayDetails();

        
        System.out.println("-----------------");
        savingAccount1.transfer(1000, savingAccount2);
        System.out.println("-------------------------");
        savingAccount1.displayDetails();
        savingAccount2.displayDetails();

        sc.close();
    }
}



/*


package bank_test2;
 
import java.util.Scanner;
 
public class SavingsBankAccount extends BankAccount {
    private double interestRate;
 
    // Default constructor
    public SavingsBankAccount() {
        super();
    }
 
    // Parameterized constructor
    public SavingsBankAccount(String name, String accNum, double amt, double intRate) {
        super(name, accNum, amt, intRate);
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
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
    }
 
    

    @Override
    public void deposit(double... amounts) {
 
    	super.deposit(amounts);
    	double totamount = 0;
    	for(double amount : amounts) {
    		totamount += amount;
    	}
    	System.out.println("Total Deposited amount : " + totamount);
    	double interest = totamount * interestRate / 100;
        setBalance(getBalance() + interest);
        System.out.println("Interest added: " + interest);
    }






//    // Method to calculate and display savings balance with interest
//    public void displaySavingsBalance() {
//        double totalBalance = getBalance() + (getInterestRate() * getBalance() / 100);
//        System.out.println("Interest rate on this account: " + getInterestRate() + "%");
////        System.out.println("Total balance: " + totalBalance);
//    }
 
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
//        // Taking input from the user for SavingsBankAccount
//        System.out.print("Enter the name: ");
//        String name = sc.nextLine();
//
//        System.out.print("Enter the account number: ");
//        String accNum = sc.nextLine();
//
//        System.out.print("Enter the balance: ");
//        double amt = sc.nextDouble();
//
//        double intRate;
//
//        if (amt < 5000) {
//            intRate = 0;
//        } else if (amt >= 5000 && amt < 10000) {
//            intRate = 10;
//        } else {
//            intRate = 20;
//        }
 
//        SavingsBankAccount savingAccount = new SavingsBankAccount(name, accNum, amt, intRate);
//
////        savingAccount.displaySavingsBalance();
//        savingAccount.displayDetails();
//        System.out.println("-");
//        savingAccount.deposit(1000,2000,5000);
//        System.out.println("-");
//        savingAccount.deposit(1000,-2000,5000);
//        System.out.println("-");
//        savingAccount.displayDetails();
//        
        SavingsBankAccount acc1 = new SavingsBankAccount("Rohit", "AXIS0088", 0, 10);
        BankAccount acc2 = new BankAccount("Rahul", "HDFC0011", 10000, 20);

        acc1.displayDetails();
        acc2.displayDetails();
        System.out.println("");
        acc2.transfer(5000.00, acc1);
        acc1.displayDetails();
        acc2.displayDetails();
        System.out.println("");
        acc2.transfer(7000.00, acc1);

        acc1.displayDetails();
        acc2.displayDetails();
        System.out.println("");
        acc2.transfer(-5000.00, acc1);
        sc.close();
    }
}
 
 */
