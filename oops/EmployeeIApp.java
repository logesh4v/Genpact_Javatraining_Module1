package oops;

import oopss.EmployeeInterface;
import oopss.FullTimeEmployeeI;
import oopss.InternsI;
import oopss.PartTimeEmployeeI;

public class EmployeeIApp {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		FullTimeEmployeeI f1 = new FullTimeEmployeeI("sanjay", 12345, "Tech", 100000, 2000);
		f1.displayEmpDetails();
		f1.OrganizationPolicy();
		f1.jobLocation();
		System.out.println("------------------");
 
		
		PartTimeEmployeeI p1 = new PartTimeEmployeeI("mohan", 9034, "Operations", 5000, 5);
		p1.displayEmpDetails();
		p1.OrganizationPolicy();
		p1.jobLocation();
		System.out.println("------------------");
 
		
		InternsI i1 = new InternsI ("LOGESH", 7031, "Management", 15000);
		i1.displayEmpDetails();
		i1.jobLocation();
		System.out.println("------------------");
		EmployeeInterface.CEOName(); //static methods can only be called with InterfaceName not from object
 
	}
 
}