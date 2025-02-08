package JavaBasics;
 
import java.util.Scanner;
 
public class FunctionsConcepts {
public static double calFare(double distance) {
		return distance*10;
	}
	public static double calFare(double distance,String cab) {
		if(cab.equalsIgnoreCase("suv")){
			return distance*25;
		}
		else if(cab.equalsIgnoreCase("premium")) {
			return distance*20;
		}
		else 
		{
		   return calFare(distance);
		}
	}
	public static double calFare(double distance,String cab,boolean peakTime) {
		double ans=calFare(distance,cab);
		if(peakTime) {
			return ans+10;
		}
		return ans;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	FunctionsConcepts taxi=new FunctionsConcepts();
	System.out.print("Enter the distance");
	double distance=sc.nextDouble();
	System.out.print("Enter the cab type");
	String cab=sc.next();
	System.out.print("Peak time or not");
	boolean isPeakTime=sc.nextBoolean();
	double fare=calFare(distance,cab,isPeakTime);
	System.out.println("Total fare-"+fare);
	sc.close();
	}
}