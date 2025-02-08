package oops;

public class PremiumSavingAccount extends Savingsbankaccount{

    private double bonusInterest;

    public PremiumSavingAccount() {
        super();
    }
    public PremiumSavingAccount(String name, String accNum, double amt, double intrate, double bonusInterest) {
        super(name, accNum, amt, intrate);
        this.bonusInterest = bonusInterest;
    }
    // Getter and Setter for bonusInterest
    public double getBonusInterest() {
        return bonusInterest;
    }
    public void setBonusInterest(double bonusInterest) {
        this.bonusInterest = bonusInterest;
    }
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        double bonus = amount * bonusInterest / 100;
        super.setbalance(super.getbalance() + bonus);
        System.out.println("Bonus Interest Added: " + bonus);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus Interest Rate: " + bonusInterest);
        System.out.println("_________________________________");
    }
    public static void main(String[] args) {
    	PremiumSavingAccount p=new PremiumSavingAccount("mohan","ICICI",1000,7,8);
    	BankAccount b=new Savingsbankaccount ("mohan","HDFC90",2000,8);
    	Savingsbankaccount s=new PremiumSavingAccount("mohan","hdfc",3000,9,8);
    	s.displayDetails();
    	System.out.println("_________________________________");
    	s.deposit(5000);
    	s.displayDetails();
    	System.out.println("_________________________________");
    	s.deposit(579,765);
    	s.displayDetails();

    }
}
//cons
//getter setter
//override--deposit()--extra bonus interest
//override--displaydetails()--add print to display bonus interest
//Assignment-> BankApplication->arrays of objects->
//->multilevel->Test parent ref -> SavingsAccount, BankAccount
//->Study about typecasting->explicit,implicit,upcasting,downcasting
//->when to typecast
//update your Bookmanagement/library->add all these features