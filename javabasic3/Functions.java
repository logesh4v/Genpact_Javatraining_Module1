package javabasic3;

public class Functions
{
	public static int addnum(int a,int b)
	{
		int sum=0;
		sum=a+b;
		return sum;
	}
	
	public static int addnum(double a,int b)
	{
		double sum=0;
		sum=(a+b);
		return (int) sum;
	}
	public static void main(String[] args)
	{
		int result;
		result=addnum(4,6);
		System.out.println("Answer"+result);
		System.out.println("Answer"+addnum(60,89));
		System.out.println("Answer"+addnum(78.98,87));
		System.out.println(Math.sqrt(89));
	}
	

}
