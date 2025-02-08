package bank_test2;

import java.util.*;

public class Bank_App {
	private static BankAccount[] accounts; //creating of array,arrays are fixed size-5
	// new acc is created and needed to be tracked
	private static int totalAccounts=0;
	private static int maxAccounts=5;
	
public static void main (String [] args)
{
	//array of objects
	//array of bankaccount from user
	//fetch everything from user
	//bankacc,sbclass
	//make it user interactive--ak--ba,sba
	//methods in this one
	//create account
	//display account--speftic
	//deposit---in which account--acc no
	//withdraw--which account
	//trasnfer
	
	Scanner scanner=new Scanner(System.in);
	accounts=new BankAccount[5];
	
	while(true)
	{
		System.out.println("Bank Application Menu");
		System.out.println(" Press 1:To create an account ");
		System.out.println(" Press 2 : Display all the accounts");
		System.out.println(" Press 3:For Deposit of money ");
		System.out.println("Press 4 :withdraw money");
		System.out.println("Press 5 :Transfer Money");
		System.out.println("Press 6 :Exit");
		int choice=scanner.nextInt();
		
		switch (choice) {
		case 1:
			createAccount(scanner);
			break;
		case 2:
			displayAllAccounts();
			break;
		case 3:
			depositMoney(scanner);
			break;
		case 4:
			withdrawMoney(scanner);
		case 5:
			trasferMoney(scanner);
			break;
		case 6:
			System.out.println("Existing from the system,Thank you" );
			scanner.close();
			return;
		default:
			System.out.println("Invaild  choice Enter value from 1 TO 6"+"Based the needs");
			
		
		}
		
	}
	
	
	
}

public static void createAccount(Scanner scanner)
{
	if(totalAccounts>=maxAccounts)
	{
		System.out.print("Cannot create more account ");
		return;
	}
	//BA,SB--account,accno,balance,sb-interest rate
	System.out.println("Enter your acc holder name");
	String accountName=scanner.next();
	System.out.println("Enter the account number");
	String accountNumber=scanner.next();
	System.out.println("Enter the inital balance");
	double accountBalance=scanner.nextDouble();
	System.out.println("Current account or saving account");
	String isSaving=scanner.next();
	
	if (isSaving.equalsIgnoreCase("Yes"))
	{
		System.out.println("Enter the Intrest Rate-");
		double interestRate=scanner.nextDouble();
		accounts[totalAccounts]=new SavingsBankAccount(accountName,accountNumber,accountBalance,interestRate);
	}
	else
	{
		accounts[totalAccounts]=new BankAccount(accountName,accountNumber,accountBalance,interestRate);
	}
	System.out.println("Account created successfully!!");
	totalAccounts++;
		
		
	}
//case 2
public static void displayAllAccounts()
{
	if(totalAccounts==0)
	{
		System.out.println("No account to display");
		return;
	}
	System.out.println("Bank  Account details__________");
	for(int i=0;i<totalAccounts;i++)
	{
		accounts[i].displayDetails();
		System.out.println("----------------------------");
	}
	
}

//case 3
public static void depositMoney(Scanner scanner)
{
	System.out.println("Enter the account number-");
	String accNum=scanner.next();
	System.out.println("Enter the amount to be deposited");
	double amount =scanner.nextDouble();
	
	BankAccount account=findAccount(AccountNumber);
	if(account!=null)
	{
		account.deposit(amount);
		
	}
	else
	{
		System.out.println("Account not found");
		
	}
}

public static BankAccount findAccount(String accountNumber)
{
	for(int i=0;i<totalAccounts;i++)
	{
		if(accounts[i].getAccountNumber().equals(accountNumber))
		{
			return accounts[i];
		}	
		return null;
				
	}
	
	
	
	
	
	//CASE 4 
public static  withdrawMoney(Scanner scanner) 
{
	System.out.println("Enter account no.: ");
	String accNum = sc.next();
	System.out.println("Enter amount to be withdrawn: ");
	double amount = sc.nextDouble();
	BankAccount account = findAccount(accNum);
	if(account != null) {
		account.withdraw(amount); //will call deposit method with single amount
		}
	else {
		System.out.println("Account not found");
	}
}
	
	
	//5
	public static void transferMoney(Scanner scanner) 
	{
		System.out.println("Enter sender's account number: ");

	String acc1 = scanner.next();
	System.out.println("Enter transfer amount: ");
	double amount = scanner.nextDouble();
	System.out.println("Enter reciever's account number: ");
	String acc2 = scanner.next();
	BankAccount sender = findAccount(acc1);
	BankAccount receiver = findAccount(acc2);
	if(sender != null && receiver != null) {
		sender.withdraw(amount); //will call deposit method with single amount
	}
	receiver.deposit(amount);
	
	else if (sender == null){
	System.out.println("Sender's Account not found");
	}
	else if (receiver == null){
	System.out.println("Receiver's Account not found");
	}
	else {
	System.out.println("Invalid account no.");
			}
	
	
	
	
}


















































}
