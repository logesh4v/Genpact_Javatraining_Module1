package oopss;
 
public class EmployeeMgmtApp {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee e1 = new FullTimeEmployee("Abhi", 123, "Tech", 100000, 2000, 24);
		System.out.println("Full-time salary: " + e1.calSalary());
		e1.displayEmpDetails();
		PartTime p1 = new PartTime("Prateek", 122, "operations", 500, 5);
		System.out.println("Part-time salary: " + p1.calsalary());
		p1.setHourlyRate(10);
		System.out.println("Part-time salary: " + p1.calsalary());

 
		Intern i1 = new Intern("Aakash", 231, "IT", 15000);
		System.out.println("Intern Stipend: " + i1.calsalary());
		System.out.println("Stipend: " + i1.getStipend());
		e1.applyLeave(14);
 
		//p1.applyLeave(30);
		//i1.applyLeave(2);
		//System.out.println("Updated Full time employee leaves: " + e1.getLeaveDays());
	}

 
}