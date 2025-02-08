package javabasic;
import java.util.*;

public class Day1_problem {
	public static void main (String[] args)
	
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of items");
		int n=scanner.nextInt();
		double totalcost=0;
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the price of the item"+(i+1)+"-");
			double price=scanner.nextDouble();
			System.out.println("Enter the quanity of item"+(i+1)+"-");
			int quantity=scanner.nextInt();
			totalcost+=price*quantity;
		}
		double discount=0;
		
		if(totalcost>=1000)
		{
			discount=0.20*totalcost;
		}
		else if (totalcost>=5000)
		{
			discount=0.10*totalcost;
		}
		double finalcost=totalcost-discount;
				
		double shippingcost=0;
		double TAP=finalcost+shippingcost;
		
		System.out.println("Total order cart value is-"+totalcost);
		
		System.out.println("Discount on total value-"+discount);
		
		System.out.println("shipping cost-"+shippingcost);
		
		System.out.println("Final Bill value to be paid "+TAP);
		
		scanner.close();	
				
	}

}
