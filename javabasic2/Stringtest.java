package javabasic2;

import java.util.Scanner;

public class Stringtest {
	
	public static void main (String[] args)
	{
		String s1="Java test";
		String s3="Java test";
		
		String s2=new String("Java test");
		String s4=new String ("Java test");
		
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		
		String pwd ="Admin123";
		String password;
		//equalsingorecase
		Scanner scanner =new Scanner (System.in);
		System.out.print("Enter your password-");
		password=scanner.nextLine();
		
		if(pwd.equalsIgnoreCase(password))
		{
			System.out.println("Correct password");
		}
		else {
			System.out.println("Wrong password");
		}
		String mail="test@gmail,com";
		if ((mail.contains("@")) && (mail.endsWith(".com")))
				{
			
				}
		
		else
		{
			
		}
		String message="Java class";
		String newmessage=message.replace("class","subject");
		StringBuffer str= new StringBuffer("JAVA");
		System.out.println(str);
		
		str.append(" Training");
		System.out.println(str);
		str.insert(7, "DAY 2");
		System.out.println(str);
		
		str.replace(8, 11, "Genpact");
		System.out.println(str);
		
		str.delete(4,7);
		System.out.println(str);
	
		str.reverse();
		System.out.println(str);
		
		
		
		StringBuilder test=new StringBuilder("Hello Java");
		System.out.println(test);
		
		str.append(" Training");
		System.out.println(str);
		str.insert(7, "DAY 2");
		System.out.println(str);
		
		str.replace(8, 11, "Genpact");
		System.out.println(str);
		
		str.delete(4,7);
		System.out.println(str);
	
		str.reverse();
		System.out.println(str);
		scanner.close();
		
	}
	
}

