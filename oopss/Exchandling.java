package oopss;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.*;

public class Exchandling {
	public static void main (String[] args) throws IOException
	
		
	{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.print("Enter 2 numbers ");
			int a=Integer.parseInt(dis.readLine());
			int b=Integer.parseInt(dis.readLine());
			int[]arr= {10,20,30};
	
			
		
		try {
			int c=a/b;
			System.out.println("Divsion of 2 numbers"+c);
			System.out.println(arr[4]);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Excpetion caught-"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Excpetion caught-"+e.getMessage());
		}
		
		
		catch(Exception e) {
			
			System.out.println("Excpetion caught-"+e.getMessage());
		}
		
		
		finally
		{
			System.out.println("Thank you");
		}
	}
	

}












