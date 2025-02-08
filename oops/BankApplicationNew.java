/*package oops;
import java.util.Scanner;
 
public class BankApplicationNew {
	private static BankAccount[] accounts; //crt array , array ->fixed size -5
	// new account - crt - keep track variable
	private static int totalAccounts =0;
	private static int maxAccounts  = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array of objects
		//Array of Bankaccount class , fetch eveything from user
		//bankaccount , SBclass
		//make it user interactive -> BA,SBA
		//crt account , display account , deposit -> in which acc , withdraw ->in which acc, transfer
		Scanner scanner = new Scanner(System.in);
		accounts = new BankAccount[5];
		while(true) {
			System.out.println("Bank Application Menu");
			System.out.println("Press 1: To create an account");
			System.out.println("Press 2: Display All account");
			System.out.println("Press 3: Deposit Money");
			System.out.println("Press 4: Withdraw Money");
			System.out.println("Press 5: Transfer Money");
			System.out.println("Press 6: Tranfer amount to many accounts");
			System.out.println("Press 7:Buy stocks");
			System.out.println("Press 8:Buy stocks");
			
			
			System.out.println("Press 9: EXIT");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				createAccount(scanner);
				break;
			case 2 :
				displayAllAccounts();
				break;
			case 3 :
				depositMoney(scanner);
				break;
			case 4:
				withdrawMoney(scanner);
				break;
			case 5:
				transferMoney(scanner);
				break;
			case 6:
				depositMoney1 (scanner);
				System.out.println("Transfer Money to many accounts");
				break;
			case 7:
				buystocks1(scanner);
				break;
			case 8:
				//sellstocks(scanner);
				break;
				
				//case 7-to buy stocks irctc(scanner)
			//case 8 to sell stocks(scanner)
				
			case 9:
				System.out.println("Exiting from system .Thankyou");
				scanner.close();
				return;
			default:
				System.out.println("Invalid Choice . Enter from 1-6");
			}
		}
	}
	private static void buystocks1(Scanner scanner) {
		
	
		
	}
		// TODO Auto-generated method stub
		
	
	public static void createAccount(Scanner scanner) {
		if(totalAccounts >= maxAccounts) {
			System.out.println("Cannot create more account");
			return;
		}
		// BA,SB -> accountname, accNo,balance ,sb - interest rate
		System.out.println("Enter account holder name");
		String accountName = scanner.next();
		System.out.println("Enter account Number");
		String accountNumber = scanner.next();
		System.out.println("Enter initial balance");
		double accountBalance = scanner.nextDouble();
		System.out.println("Is it a current account or savings account ?");
		String isSaving = scanner.next();
		//remvoe the above option as current or saving with below data
		//which account type from 4 types
		//switch case
		//bank account,premium account ,saving account,demand account with switchcase
		//switch case1-bank account,premium account,demant account ,saving account
		
		if(isSaving.equalsIgnoreCase("yes")) {
			System.out.println("Enter interest Rate :");
			double interestRate = scanner.nextDouble();
			accounts[totalAccounts] = new Savingsbankaccount(accountName,accountNumber,accountBalance,interestRate);
		}
		else {
			accounts[totalAccounts] = new BankAccount(accountName,accountNumber,accountBalance);
		}
		System.out.println("Account created successsfully");
		totalAccounts++;
		
		
		
	}
	//case2
	public static void displayAllAccounts() {
		if(totalAccounts ==0) {
			System.out.println("No account to display");
			return;
			}
		System.out.println("Bank Account Details ------");
		for(int i=0;i<totalAccounts ;i++) {
			accounts[i].displayDetails();
			System.out.println("Bank Account Details ------");
		}
	}	
		//case3
		//account[0],account[1]
	public static void depositMoney(Scanner scanner) {
			//amount , accountNum
			System.out.print("Enter Account Number :");
			String accNum = scanner.next();
			System.out.print("Enter amount to be deposited");
			double amount = scanner.nextDouble();
			BankAccount account = findAccount(accNum); //if no acc exist with acc no -> find null, otherwise
			if(account != null) {
				account.deposit(amount);
			}
			else {
				System.out.print("Account not found");
			}
		}
	public static BankAccount findAccount(String accountNumber) {
		for(int i=0;i<totalAccounts;i++) {
			if(accounts[i].getaccountNumber().equals(accountNumber)) {
				return accounts[i];
			}
		}
		return null;
	}
	// case 4 -> withdrawMoney
	//accNum ->how much amt ->withdraw
	public static void withdrawMoney(Scanner scanner) {
		//amount , accountNum
		System.out.print("Enter Account Number :");
		String accNum = scanner.next();
		System.out.print("Enter amount to be Withdraw");
		double amount = scanner.nextDouble();
		BankAccount account = findAccount(accNum); //if no acc exist with acc no -> find null, otherwise
		if(account != null) {
			 account.withdraw(amount);
		}
		else {
			System.out.print("Account not found");
		}
	}
	// case 5 : transferMoney
	public static void transferMoney(Scanner scanner) {
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
			receiver.deposit(amount);
		}
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
		public static void depositMoney1 (Scanner scanner)
		{
		    System.out.print("Enter the number of deposits you want to make: ");
		    int numDeposits = scanner.nextInt();
		    
		    for (int i = 0; i < numDeposits; i++) {
		        System.out.print("Enter Account Number: ");
		        String accNum = scanner.next();
		        System.out.print("Enter amount to be deposited: ");
		        double amount = scanner.nextDouble();
		        
		        BankAccount account = findAccount(accNum); //if no acc exist with acc no -> find null, otherwise
		        if (account != null) {
		            account.deposit(amount);
		            System.out.println("Amount deposited successfully.");
		        } else {
		            System.out.println("Account not found.");
		        }
		    }
		    
		    public static void buystocks (Scanner scanner)
		    {

		    	public void buyStocks() {
		    	    Scanner scanner = new Scanner(System.in);
		    	    
		    	    // Get user input for quantity and price per stock
		    	    System.out.print("Enter quantity of stocks to buy: ");
		    	    int quantity = scanner.nextInt();
		    	    
		    	    System.out.print("Enter price per stock: ");
		    	    double pricePerStock = scanner.nextDouble();
		    	    
		    	    // Calculate total cost
		    	    double totalCost = quantity * pricePerStock;
		    	    
		    	    // Check if there is sufficient balance
		    	    if (getbalance() >= totalCost) {
		    	        setbalance(getbalance() - totalCost);
		    	        stockHoldings += quantity;
		    	        System.out.println("Stocks bought successfully. Total cost: " + totalCost);
		    	    } else {
		    	        System.out.println("Insufficient balance to buy stocks");
		    	    }
		    	    
		    	    scanner.close();
		    	}
		    	
		    }
		 
	}*/
package oops;
import java.util.Scanner;
 
public class BankApplicationNew {
	private static BankAccount[] accounts;
	private static int totalAccounts = 0;  //static -> will be allocated memory only once
	private static int maxAccounts = 5;

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		accounts = new BankAccount[5]; //new array called accounts
		while (true) {
			System.out.println("Bank Application Menu");
			System.out.println("Press 1: Create an account");
			System.out.println("Press 2: Display all account");
			System.out.println("Press 3: Deposit money");
			System.out.println("Press 4: Withdraw money");
			System.out.println("Press 5: Transfer money");
			System.out.println("Press 6: Buy Stocks");
			System.out.println("Press 7: Sell Stocks");
			System.out.println("Press 8: Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: 
					createAccount(sc);
					break;
			case 2:
					displayAllAccounts();
					break;
			case 3:
					depositMoney(sc);
					break;
			case 4: 
					withdrawMoney(sc);
					break;
			case 5:
					transferMoney(sc);
					break;
			case 6:
					buyStocks(sc);
					break;
			case 7:
					sellStocks(sc);
					break;
			case 8:
					System.out.println("Exiting from system!");
					sc.close();
					return;
			default:
					System.out.println("Invalid Choice. Enter no. from 1 to 8");
			}
		}
	}
 
 
	//CASE 1
	public static void createAccount(Scanner sc) {
		if(totalAccounts >= maxAccounts) {
			System.out.println("Cannot create new account");
			return;
		}
		System.out.println("Enter Name");
		String accountName = sc.next();
		System.out.println("Enter Account Number");
		String accountNumber = sc.next();
		System.out.println("Enter initial balance");
		double accountBalance = sc.nextDouble();
		System.out.println("Choose type of account: ");
//		String isSaving = sc.next();
		//enhance this method
		//BA, SBA, PSA, DA
		//ask which account 
		//1-> BA, 2-> SBA, 3->PSA, 4->DA
		System.out.println("Press 1: Current Bank Account");
		System.out.println("Press 2: Savings Bank Account");
		System.out.println("Press 3: Premium Savings Bank Account");
		System.out.println("Press 4: Demat Account");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: 
				accounts[totalAccounts] = new BankAccount(accountName, accountNumber, accountBalance);
				break;
		case 2:
				System.out.println("Enter interest rate: ");
				double interestRate = sc.nextDouble();
				accounts[totalAccounts] = new Savingsbankaccount(accountName, accountNumber, accountBalance, interestRate);
				break;
		case 3:
				System.out.println("Enter interest rate: ");
				double interestR = sc.nextDouble();
				System.out.println("Enter bonus rate");
				double bonusRate = sc.nextDouble();
				accounts[totalAccounts] = new PremiumSavingAccount(accountName, accountNumber, accountBalance, interestR, bonusRate);
				break;
		case 4: 
				System.out.println("Enter stock");
				int stock = sc.nextInt();
				accounts[totalAccounts] = new DematAccount(accountName, accountNumber, accountBalance, stock);
				break;
		default:
				System.out.println("Invalid Choice. Enter no. from 1 to 4");
		}
//		if(isSaving.equalsIgnoreCase("yes")) {
//			System.out.println("Enter interest rate: ");
//			double interestRate = sc.nextDouble();
//			accounts[totalAccounts] = new savingsBankAccount(accountName, accountNumber, accountBalance, interestRate);
//		}
//		else {
//			accounts[totalAccounts] = new BankAccount(accountName, accountNumber, accountBalance);
//		}
		System.out.println("Account created succefully");
		totalAccounts++;
	}

	//CASE 2
	public static void displayAllAccounts() {
		if(totalAccounts == 0) {
			System.out.println("No account to display");
			return;
		}
		System.out.println("Bank Accounts Details --------");
		for(int i=0; i<totalAccounts; i++) {
			accounts[i].displayDetails();
			System.out.print("--------------");
		}
	}

	//CASE 3
	public static void depositMoney(Scanner sc) {
		System.out.println("Enter account no.: ");
		String accNum = sc.next();
		System.out.println("Enter the no. of deposits you need to make: ");
		int num = sc.nextInt();
		double totalDeposit = 0.0;
		for (int i=0; i<num; i++) {
			System.out.println("Enter amount to be deposited: ");
			double amount = sc.nextDouble();
			if(amount>0) {
				totalDeposit += amount;
			}
			else {
				System.out.println("Negative amount is not allowed");
			}
		}
//		account.deposit(totalDeposit);
 
		BankAccount account = findAccount(accNum);
		if(account != null) {
			account.deposit(totalDeposit); //will call deposit method with single amount
		}
		else {
			System.out.println("Account not found");
		}
	}

//	public double deposit(Scanner sc) { // we are depositing multiple checks
//		double totalDeposit = 0.0;
//		
//		for(double amount: amounts) {
//			if(amount>0) {
//				totalDeposit += amount;
//			}
//			else {
//				System.out.println("Negative amount is not allowed");
//			}
//		}
//		return totalDeposit;
////		System.out.println("Updated balance: " + balance);
//	}


	public static BankAccount findAccount(String accountNumber) {
		for(int i =0; i<totalAccounts; i++) {
			if(accounts[i].getaccountNumber().equals(accountNumber)) {
				return accounts[i];
			}
		}
		return null;
	}
	//CASE 4 
	public static void withdrawMoney(Scanner sc) {
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
	//CASE 5
	public static void transferMoney(Scanner sc) {
		System.out.println("Enter sender's account number: ");
		String acc1 = sc.next();
		System.out.println("Enter transfer amount: ");
		double amount = sc.nextDouble();
		System.out.println("Enter reciever's account number: ");
		String acc2 = sc.next();
		BankAccount sender = findAccount(acc1);
		BankAccount receiver = findAccount(acc2);

 
		if(sender != null && receiver != null) {
			sender.withdraw(amount); //will call deposit method with single amount
			receiver.deposit(amount);
		}
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

	//CASE 6
		public static void buyStocks(Scanner sc) {
			System.out.println("Enter account number: ");
			String acc1 = sc.next();
			System.out.println("Enter stock quantity: ");
			int quantity = sc.nextInt();
			System.out.println("Enter stock price: ");
			double price = sc.nextDouble();
			BankAccount account = findAccount(acc1);
 
			if(account != null) {
				((DematAccount) account).buyStocks(quantity, price);
			}
			else {
				System.out.println("Account not found");
			}
		}

//		public static DematAccount findDematAccount(String accountNumber) {
//			
//			for(int i =0; i<totalAccounts; i++) {
//				if(accounts[i].getAccountHolderNumber().equals(accountNumber)) {
//					return accounts[i];
//				}
//			}
//			return null;
//		}

		//CASE 6
				public static void sellStocks(Scanner sc) {
					System.out.println("Enter account number: ");
					String acc1 = sc.next();
					System.out.println("Enter stock quantity: ");
					int quantity = sc.nextInt();
					System.out.println("Enter stock price: ");
					double price = sc.nextDouble();
					BankAccount account = findAccount(acc1);
 
					if(account != null) {
						((DematAccount) account).sellStocks(quantity, price);
					}
					else {
						System.out.println("Account not found");
					}
				}



}

