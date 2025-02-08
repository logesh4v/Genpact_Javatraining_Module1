package javabasic;
import java.util.*;
public class SWI {

	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary");
		double currsalary=sc.nextDouble();
		System.out.println("Enter rating");
		int rating=sc.nextInt();
		
		double hikevalue=0.0;
		
		switch (rating)
		{
		case 5:
			hikevalue=0.20;
			
			break;
		case 4:
			hikevalue=0.15;
			break;
		case 3:
			hikevalue=0.10;
			break;
		case 2:
			hikevalue=0.5;
			break;
		case 1:
			hikevalue=0;
			break;
		default:
				System.out.println("Enter the correct value of rating");
			}
		double newsalary =currsalary+(currsalary*hikevalue);
		System.out.print("Refer Your new salary after hike:"+newsalary);
		sc.close();
	}
}

	
