package EmployeeMangementSystem;
 
public class FullTimeEmployee extends Employee implements Taxable, WorkHours{
	private double bonus;
 
	public FullTimeEmployee(String empName, int empId, String department, double baseSalary, int leaveBalance,double bonus) {
		super(empName, empId, department, baseSalary, leaveBalance);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}
 
	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return empName;
	}
 
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return empId;
	}
 
	@Override
	public int getWorksHour() {
		// TODO Auto-generated method stub
		return Standard_WorkHours;
	}
 
	@Override
	public double calaculateTax(double salary) {
		// TODO Auto-generated method stub
		return salary*0.20;
	}
 
	@Override
	double calaculateSalary() {
		// TODO Auto-generated method stub
		return baseSalary+bonus;
	}
 
	@Override
	String getemploymentType() {
		// TODO Auto-generated method stub
		return "Full Time Employee";
	}
 
	@Override
	void provideBenefits() {
		// TODO Auto-generated method stub
		System.out.println("Health Insurence Benefits,Provident Fund");
	}
}