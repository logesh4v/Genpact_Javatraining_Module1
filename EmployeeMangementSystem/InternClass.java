package EmployeeMangementSystem;

public class InternClass extends Employee{
	private double stipend = 50000;
 
	public InternClass(String empName, int empId, String department, double baseSalary, int leaveBalance, double stipend2) {
		super(empName, empId, department, baseSalary, leaveBalance);
		this.baseSalary=stipend;
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
	double calaculateSalary() {
		// TODO Auto-generated method stub
		return stipend;
	}
 
	@Override
	String getemploymentType() {
		// TODO Auto-generated method stub
		return "Intern";
	}
 
	@Override
	void provideBenefits() {
		// TODO Auto-generated method stub
		System.out.println("Aulumi Profile");
	}

}
