package oopss;
 
public class FullTimeEmployeeI implements EmployeeInterface {
	private String empName;
	private int empId;
	private String empDept;
	private double basicSalary;
	private double bonus;
 
	
	public FullTimeEmployeeI(String empName, int empId, String empDept, double basicSalary, double bonus) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
		this.basicSalary = basicSalary;
		this.bonus = bonus;
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
 
	public double getBasicSalary() {
		return basicSalary;
	}
 
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
 
	public double getBonus() {
		return bonus;
	}
 
	public void setBonus(double bonus) {
		this.bonus = bonus;
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
		return basicSalary + bonus;
	}

 
}