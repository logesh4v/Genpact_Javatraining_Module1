package oops;
 
import java.util.Scanner;
 
public class BankApplication {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		//implementation class of bank accounts
		//create objects-use class name object name =
		//application for the end user
		//online facility
		//they ask to fill up form
		//ask values from user
		//Scanner -> ask values form user -> name,accNumber,balance
//		System.out.println("Enter holder name");
//		String accountHolderName=sc.next();
//		System.out.println("Enter account no");
//		String accountNumber=sc.next();
//		System.out.println("Enter balance");
//		double balance=sc.nextDouble();	
	//	Bankaccount a1=new Bankaccount(accountHolderName,accountNumber,balance);
//
		BankAccount a1=new BankAccount("logesh","ICICI",100000.0); //first object reverse memory-n,ac,b
        //give data to fields
//		a1.accountHolderName="";
//		a1.accountNumber="ICICI";
//		a1.balance=10000.00;
		//before transaction
//		a1.checkBalance();
//		//deposit money
//		a1.deposit(5000);
//		a1.checkBalance();
//		a1.displayDetails();
//		//withdraw money -> sufficient balance,insufficient balance 
//		a1.withdraw(200);
//		a1.checkBalance();
//		a1.withdraw(10000);
//		a1.checkBalance();
//		a1.setAccountHolderName("Siri");
//		a1.displayDetails();
		//add negative balance
		//SavingsAccount a2=new Bankaccount(); //first object reverse memory-n,ac,b
//        //give data to fields
//		a2.accountHolderName="Neelima";
//		a2.accountNumber="HDFC";
//		a2.balance=10000.00;
//		//before transaction
//		a2.checkBalance();
//		//deposit money
//		a2.deposit(5000);
//		a2.checkBalance();
//		
		//p1
		//p2
		//p1.transfer(5000,p2)
		//sb object
		//p1->sb object
		BankAccount a2=new BankAccount("mohan","HDFC",1006.0);
		a1.transfer(5000, a2);

//		//withdraw money -> sufficient balance,insufficient balance 
//		a2.withdraw(20000);
//		a2.checkBalance();
//		a2.withdraw(10000);
//		a2.checkBalance();		
		Savingsbankaccount s1=new Savingsbankaccount("guru","SBIN999000",5000,0.9);
		Savingsbankaccount s2=new Savingsbankaccount("gopika","SBIN678",9076,0);
		//s1.calculateInterest();	
		s1.displayDetails();
		
		System.out.println(a1.new);
		//s1.deposit(1000.0);
		s1.deposit(2000,657,98);
		s1.displayDetails();
		Savingsbankaccount a3=new Savingsbankaccount("logesh","ICICI",100000.0,8); //first object reverse memory-n,ac,b
        a3.displayDetails();
        //a3.deposit(1000.0);
        a3.deposit(-100,-743,7800);
        a3.displayDetails();
        ((Savingsbankaccount)a3).setIntrestRate(10);
        s1.transfer(690,s2);
        //type casting -> (type)account3)
       // SavingsBankaccount a3=new Bankaccount("","ICICI",100000.0,8); //first object reverse memory-n,ac,b
	}
}
