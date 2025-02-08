package oopss;
import java.util.*;
import java.io.FileReader;
import java.io.IOException;
/*

public class E2 {
	static void checkAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not able to crate a bank account");
			
		}
		System.out.print("Eligile to open the bank account");
	}
	
	static void readFile() throws IOException
	{
		FileReader file=new FileReader("Notes.txt");
	}
	
	
		public static void main (String args[])
		{
			checkAge(20);
			
			try
			{
				readFile();
			}
			catch(IOException e)
			{
				System.out.println("Exception handled"+e.getMessage());
			}
			
		}
		
	}


*/
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
	

	
	}



class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class E2 {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be more than 18 for starting the account");
        }
    }

    static void withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for this transaction");
        }
        balance -= amount;
        System.out.println("Withdrawal successful and Remaining balance in your account " + balance);
    }

    public static void main(String args[]) {
        try {
            validateAge(21);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught - " + e.getMessage());
        }

        //double balance = 1000.0;
        double balance = 2000.0;
        double amount = 1500.0;

        try {
            withdraw(balance, amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught - " + e.getMessage());
        }
    }
}
