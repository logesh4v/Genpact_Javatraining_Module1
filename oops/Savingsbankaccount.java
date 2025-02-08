package oops;
 
public class Savingsbankaccount extends BankAccount{
	public double intersetRate=0.5;
	public Savingsbankaccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Savingsbankaccount(String name, String accNum, double amt) {
		super(name, accNum, amt);
		// TODO Auto-generated constructor stub
	}
	public Savingsbankaccount(String name, String accNum, double amt,double intrate) {
		super(name, accNum, amt);
		// TODO Auto-generated constructor stub
		this.intersetRate=intrate;
	}

	public double getIntersetRate() {
		return intersetRate;
	}
	public void setIntrestRate(double interestRate) {
		this.intersetRate = interestRate;
	}
 
	
	//intrest to be paid on balance ->10 , show much interst customer is getting
	//total balance ->adding interest
	//adding implmentation class - just one object ->
	//method overriding ->polymorphsim
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
	@Override
	public void deposit(double amount) {
		//add amt to balance
		super.deposit(amount);//call bankaccount ->deposit()
		double interest = amount*intersetRate/100;
		super.setbalance(super.getbalance()+interest);//adding int to balance
		System.out.println("Interst Added :"+interest);
	}

 
	@Override
	public void deposit(double... amounts) { 
		super.deposit(amounts);
		double balance = (super.getbalance()*intersetRate/100);
		System.out.println("Updated balance :"+balance);
		}
	@Override
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Interest rate is :"+intersetRate);
		System.out.println("_________________________________");
	}
}
 