package javabasic3;
import java.io.DataInputStream;
import java.io.IOException;

public class Fun_test {
	public static void main (String[ ] args)throws IOException
	{
		DataInputStream input =new DataInputStream(System.in);
		
		System.out.println("Welcome to java training");
		
		System.out.println("Enter a number-");
		
		int number=Integer.parseInt(input.readLine());
		
		System.out.println("Enter your name-");
		String name=input.readLine();
		System.out.println("welcome "+name+" "+"For the Java training");
		System.out.println("The cube value-"+cube(number));
		System.out.println("The fact value-"+fact(number));
		even(number);
				
	}
	public static double cube(int number)
	{
		return Math.pow(number, 3);
	}
	
	public static int fact(int number)
	{
		int fact=1;
		for (int i = 1;i<=number;i++)
		{
			fact*=i;
			
		}
		return fact;
		
	}
	public static void even(int number)
	{
		if(number%2==0)
		{
			System.out.println("Its a even number");
			
		}
		else 
		{
			System.out.println("Its a odd number");
			
		}
	}
	

}
