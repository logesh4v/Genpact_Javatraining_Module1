package javabasic;

import java.util.Scanner;

public class fact {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int fact=1;
		if (number<0)
		{
		System.out.println("Enter positive number");
		}
		 else
		 {
			 for(int i=1;i<=number;i++)
			 {    
			      fact=fact*i;    
			      System.out.print(fact);
			  }

	}
	}
}

