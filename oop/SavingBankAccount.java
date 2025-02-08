package oop;

public class SavingBankAccount extends Bankaccount {
	
		//one base class- from inherited one derived class
		//type of inheritance
	   private double interestRate;
	 
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	public SavingsAccount(String name, String accNum, double amt,double intRate) 
	{
		//calling the constructor of the super class to initiate these 3 parameters
		super(name, accNum, amt);
		// TODO Auto-generated constructor stub
		this.interestRate=intRate;
	}
	 
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public void calculateInterest() {
		System.out.println(("you will be getting "+(interestRate*100)+"% interest"));
		double amt=super.getBalance();
		System.out.println("your interest will be " + (interestRate*amt));
		amt=(interestRate*amt);	
	}
	//public void addInterest() {
//		double interest=calculateInterest();
//		deposit(interest);
//		System.out.println("Interest added"+interest);
//		System.out.println("update balance"+getBalance());
	//}
	 
	//method calculates interest to be paid on balance-> 10%,show how much interest customer is getting
	//total balance-> adding interest
	//adding implementation class - just one object
	//give the updated definition of deposit -> cal interest and just add it to balance
	//public void displaySbAcct() {
//		super.displayDetails();
//		System.out.println("interst rate:"+interestRate);
	//	
	//}
	//method overriding-polymorphism
	@Override
	public void deposit(double amount) {
		   //add amount to balance
		   super.deposit(amount); //call BA->deposit()
		   double interest=amount*interestRate /100;
		   setBalance(getBalance()+interest); //adding interest to balance
		   System.out.println("Interest added : "+interest);
	}
	@Override
	  public void displayDetails() {
		super.displayDetails();
		System.out.println("Interest rate is :"+interestRate);
		System.out.println("-------");
	   }
	}
	//assignment:
	//completed bank account-till single inheritance
	//book management -> enhance that application by adding inheritance feature,encapsulation,add required functional methods->issue,return,stock
	 
	//BankaccountApplication:
	

