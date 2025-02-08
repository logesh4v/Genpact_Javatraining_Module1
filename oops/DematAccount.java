package oops;


public class DematAccount extends BankAccount {
	
	private int stockHoldings;
	
	public DematAccount()
	{
		super();
		
	}

	public DematAccount(String name, String accNum, double amt,int stocks) {
		super(name, accNum, amt);
		this.stockHoldings=stocks;
	}
	
	//buy stock part
	public void buyStocks(int quantity,double pricePerStock)
	{
		//cal total cost
		//subtracting from bal
		//update stocks quantity
		
		double totalCost=quantity*pricePerStock;
		if(getbalance()>=totalCost)
		{
			setbalance(getbalance()-totalCost);
			stockHoldings+=quantity;
		}
		else
		{
			System.out.println("Insufficent balance to buy stocks");
		}
	}
	//sell stocks
	//check quantity
	//price
	//earning
	//add balance 
	//update stock holding-quantity
	
	//override--display details--display stock holding
	
	    
	    // Sell stocks
	    public void sellStocks(int quantity, double pricePerStock) {
	        if (stockHoldings >= quantity) {
	            double earnings = quantity * pricePerStock;
	            setbalance(getbalance() + earnings);
	            stockHoldings -= quantity;
	            System.out.println("Stocks sold successfully. Earnings: " + earnings);
	        } else {
	            System.out.println("Insufficient stock holdings to sell");
	        }
	    }
	    
	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Stock Holdings: " + stockHoldings);
	    }
	




public static void main(String[] args){
  {
        DematAccount dematAccount = new DematAccount("test", "1234", 10000, 50);
        
        // Display initial details
        dematAccount.displayDetails();
        
        // Buy stocks
        dematAccount.buyStocks(10, 100);
        dematAccount.displayDetails();
        
        // Sell stocks
        dematAccount.sellStocks(5, 120);
        dematAccount.displayDetails();
    }
}
}
	

