package EmployeeMangementSystem;


public interface Taxable {

	//by default -> public static final

	double Tax_rate = 0.20;

	//abstract method -> by deafult

	double calaculateTax(double salary);

 
}
 