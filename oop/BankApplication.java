package oop;
 
import java.util.Scanner;
 
public class BankApplication {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("Logesh", "HDFC12345", 100000);
		SavingBankAccount account2 = new SavingBankAccount("MOHAN", "AXIS6533", 60000);
 
		
//		account1.checkBalance();
//		account1.deposit(5000);
//		account1.withdraw(1000);
//		
//		account2.checkBalance();
//		account2.withdraw(20000);
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your name: ");
//		String name = sc.next();
//		
//		System.out.println("Enter your account number: ");
//		String accNum = sc.next();
//		
//		System.out.println("Enter amount: ");
//		double amount = sc.nextDouble();
//		
//		BankAccount account3 = new BankAccount(name, accNum, amount);
//		account1.checkBalance();
		account1.displayDetails();
 
		account1.deposit(600);
		account1.displayDetails();
 
		
//		account1.setAccountHolderName("---");
//		account1.displayDetails();
 
		account1.setBalance(-300);
		account1.displayDetails();
		
		
		
	     account2.displayDetails();
		 account2.deposit(600);
		 account2.displayDetails();
		 account2.setBalance(50000);
		 account2.displayDetails();
		 
		 BankAccount account3=new SavingBankAcount("","",)
				 
		
	}
}