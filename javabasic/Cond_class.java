package javabasic;

public class Cond_class {
	
	public static void main (String[] args)
	{
		double rating=3.4;
		double salary=50000;
	
		
		if(rating>1 && rating<=2)
		{
			System.out.println("No chnage in you salary ");
		}
		else if(rating>2 && rating<=3.5)
		{
			
			System.out.println("You salary"+(salary*5));
		}
		else if(rating>3.5 && rating<=4.5)
		{
			System.out.println("your salary "+(salary*8));
		}
		else if(rating>4.5 && rating<=5);
		{
			System.out.println("your salary"+(salary*10));
		}
	}
	
	

}
