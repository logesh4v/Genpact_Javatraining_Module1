package EmployeeMangementSystem;

public class PartTimeEmployee extends Employee implements WorkHours{
	int WorkHours;
	double HourlyRate;
 
	public PartTimeEmployee(String empName, int empId, String department, double HourlyRate,int WorkHours, double hourlyrate2, int hours) {
		super(empName, empId, department,HourlyRate, WorkHours);
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
		return WorkHours;
	}
 
	@Override
	double calaculateSalary() {
		// TODO Auto-generated method stub
		return WorkHours*HourlyRate;
	}
 
	@Override
	String getemploymentType() {
		// TODO Auto-generated method stub
		return "Part Time Employee";
	}
 
	@Override
	void provideBenefits() {
		// TODO Auto-generated method stub
		System.out.println("Work from Home , Flexible Work Time");
	}
	//extend employee,implement workhour ->constant , getworkhours ->define = return no of hours
	//hourly rate,no of hours
	//
}