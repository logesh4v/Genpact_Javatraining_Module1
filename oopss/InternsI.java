package oopss;


public class InternsI implements EmployeeInterface {
	private String empName;
	private int empId;
	private String empDept;
	private double stipend;

	public InternsI(String empName, int empId, String empDept, double stipend) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
		this.stipend = stipend;
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
 
	public double getStipend() {
		return stipend;
	}
 
	public void setStipend(double stipend) {
		this.stipend = stipend;
	}
 
 
	@Override
	public void displayEmpDetails() {
		// TODO Auto-generated method stub
		System.out.println("Emp Name: " + empName);
		System.out.println("Emp Id: " + empId);
		System.out.println("Emp Department: " + empDept);
		System.out.println("Stipend: " + calSalary());	
	}
	@Override
	public double calSalary() {
		// TODO Auto-generated method stub
		return stipend;
	}
//	@Override
//	public void jobLocation() { //utility methods (can't change)
//		System.out.println("Address: ");
//	}
 
}