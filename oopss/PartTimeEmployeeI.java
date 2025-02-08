package oopss;

public class PartTimeEmployeeI implements EmployeeInterface {
	private String empName;
	private int empId;
	private String empDept;
	private double hourlyRate;
	private double hours;

 
	public PartTimeEmployeeI(String empName, int empId, String empDept, double hourlyRate, double hours) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	}

 
	public String getEmpName() {
		return empName;
	}
 
	public void setEmpName(String empName) {
		this.empName = empName;
	}
 
	public int getEmpId() {
		return empId;
	}
 
	public void setEmpId(int empId) {
		this.empId = empId;
	}
 
	public String getEmpDept() {
		return empDept;
	}
 
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
 
	public double getHourlyRate() {
		return hourlyRate;
	}
 
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
 
	public double getHours() {
		return hours;
	}
 
	public void setHours(double hours) {
		this.hours = hours;
	}
 
 
	@Override
	public void displayEmpDetails() {
		// TODO Auto-generated method stub
		System.out.println("Emp Name: " + empName);
		System.out.println("Emp Id: " + empId);
		System.out.println("Emp Department: " + empDept);
		System.out.println("Salary: " + calSalary());
	}
 
	@Override
	public double calSalary() {
		// TODO Auto-generated method stub
		return hourlyRate * hours;
	}
	@Override
	public void OrganizationPolicy() {
		System.out.println("ALL EMPLOYEES SHOULD FOLLOW COMPANY POLICIES. Flexible Working Hours");
	}
	@Override
	public void jobLocation() { //utility methods (can't change)
		System.out.println("Remote Work");
	}

 
}