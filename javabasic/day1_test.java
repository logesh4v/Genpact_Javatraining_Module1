package javabasic;
import java.io.DataInputStream;
import java.io.IOException;


public class day1_test {

	public static void main (String[] args) throws IOException
	
	
	{
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("Enter number of items-");
		int n=Integer.parseInt(dis.readLine());
		double totalcost=0;
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the price of the item "+(i+1)+"- ");
			double price=Double.parseDouble(dis.readLine());
			System.out.print("Enter the quanity of item "+(i+1)+"- ");
			int quantity=Integer.parseInt(dis.readLine());
			totalcost+=price*quantity;
		}
		double discount=0;
		
		if(totalcost>10000)
		{
			discount=0.20*totalcost;
		}
		else if (totalcost>=5000 && totalcost<=10000)
		{
			discount=0.10*totalcost;
		}
		double finalcost=totalcost-discount;
				
		double shippingcost;
		
		if (finalcost<7500)
		{
			shippingcost=250;
		}
		else
		{
			shippingcost=0;
		}
		double TAP=finalcost+shippingcost;
		
		System.out.println("Total order cart value is- "+totalcost);
		
		System.out.println("Discount on total value- "+discount);
		
		System.out.println("shipping cost- "+shippingcost);
		
		System.out.println("Final Bill value to be paid "+TAP+"rs");
		
		System.out.print("Processing to the payment gateway");
	
				
	}
}
