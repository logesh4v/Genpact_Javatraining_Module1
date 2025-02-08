package oop;

public class SavingsBankAccount extends BankAccount {
	
	private double intertestRate;
	
	public SavingBankAccount()
	{
		super();
		
	}
	public SavingsBankAccount(String name.String accnum,double amt,double intRate)
	{
		super(name,accNum,amt);
		this.interestRate=intRate;
	}
	
	Public double getInterestRate()
	{
		return interestRate;
	}
	public void SetInterestRate(double interestRate)
	this.interestRate=interestRate;
}


	
	

}



























@override 
public void deposit (double amount)
{
	super.deposit(amount);
	double interest=amount*interestRate/100;
	setBalance(getBalance)
	}