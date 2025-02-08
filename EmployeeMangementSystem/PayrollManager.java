package EmployeeMangementSystem;

public class PayrollManager {
	public static void generatePayroll(Employee emp) {
		double salary = emp.calaculateSalary();
		double tax = (emp instanceof Taxable) ? ((Taxable)emp).calaculateTax(salary) : 0.0;

 
		//instanceOf -> emp paying tax ->otherwise tax =0;	
		double netSalary = salary -tax;
		System.out.println(" Payroll for :"+emp.getEmpName());
		System.out.println("Monthly Salary :"+salary);
		System.out.println("Tax Deduction :"+tax);
		System.out.println("Net Salary :"+netSalary);
	}
 
}