package EmployeeMangementSystem;
 
import java.util.Scanner;
//import InvalidEmployeeIdException;
 
public class EMSApplication22 {

	private static Employee[] employees;
	private static int totalEmployees = 0;  
	private static int maxEmployees = 5;

 
	public static void main(String[] args) throws InvalidEmployeeIdException, InsufficientLeaveBalanceException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		employees = new Employee[5]; //new array called accounts
		while (true) {
			System.out.println("EMS Application");
			System.out.println("Press 1: Full-time Employee");
			System.out.println("Press 2: Part-time Employee");
			System.out.println("Press 3: Intern");
			System.out.println("Press 4: Manager Employee");
			System.out.println("Press 5: Display All Employee");
			System.out.println("Press 6: Payroll");
			System.out.println("Press 7: Apply leave");
			System.out.println("Press 8: Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: 
				try {
					System.out.println("Enter Name: ");
					String name = sc.next();
					System.out.println("Enter Employee Id: ");
					int id = sc.nextInt();
					System.out.println("Enter Employee Department: ");
					String department = sc.next();
					System.out.println("Enter Base Salary: ");
					double baseSalary = sc.nextDouble();
//					System.out.println("Enter Leave Balance: ");
//					int leaveBalance = sc.nextInt();
					int fixedL = 15;
					System.out.println("Enter Bonus: ");
					double bonus = sc.nextDouble();
					employees[totalEmployees++] = new FullTimeEmployee(name, id, department, baseSalary, fixedL, bonus);
				}
				catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
	
			
				
		
			case 2:
					System.out.println("Enter Name: ");
					String name2 = sc.next();
					System.out.println("Enter Employee Id: ");
					int id2 = sc.nextInt();
					System.out.println("Enter Employee Department: ");
					String department2 = sc.next();
					System.out.println("Enter Base Salary: ");
					double baseSalary2 = sc.nextDouble();
					System.out.println("Enter Leave Balance: ");
					int leaveBalance2 = sc.nextInt();
					System.out.println("Enter Hourly Rate: ");
					double hourlyRate = sc.nextDouble();
					System.out.println("Enter Hours: ");
					int hours = sc.nextInt();
					employees[totalEmployees++] = new PartTimeEmployee(name2, id2, department2, hourlyRate, hours, baseSalary2, id2);
					break;
			case 3:
					System.out.println("Enter Name: ");
					String name3 = sc.next();
					System.out.println("Enter Employee Id: ");
					int id3 = sc.nextInt();
					System.out.println("Enter Employee Department: ");
					String department3 = sc.next();
					System.out.println("Enter Stipend: ");
					double stipend = sc.nextDouble();

					employees[totalEmployees++] = new InternClass(name3, id3, department3, stipend, id2, baseSalary2);
					break;
			case 4: 
					System.out.println("Enter Name: ");
					String name4 = sc.next();
					System.out.println("Enter Employee Id: ");
					int id4 = sc.nextInt();
					System.out.println("Enter Employee Department: ");
					String department4 = sc.next();
					System.out.println("Enter Base Salary: ");
					double baseSalary4 = sc.nextDouble();
					System.out.println("Enter Leave Balance: ");
					int leaveBalance4 = sc.nextInt();
					System.out.println("Enter Bonus: ");
					double bonus2 = sc.nextDouble();

					employees[totalEmployees++] = new ManagerEmployee(name4, id4, department4, baseSalary4, leaveBalance4, bonus2);
					break;
			case 5:
					displayAll();
					break;
			case 6:
					payrollAll();
					break;
			case 7:
					applyLeave(sc);
					break;
			case 8:
					System.out.println("Exiting from system!");
					sc.close();
					return;
			default:
					System.out.println("Invalid Choice. Enter no. from 1 to 8");
			}
			System.out.println("Account created succefully");
//			totalEmployees++;
		}
	}

//	private static void addFullTimeEmployee (Scanner sc) throws {
//		
//	}
	public static void displayAll() {
		if(totalEmployees == 0) {
			System.out.println("No account to display");
			return;
		}
		System.out.println("Employees Details --------");
		for(int i=0; i<totalEmployees; i++) {
			employees[i].displayInfo();
			System.out.print("--------------");
		}
	}
 
	public static void payrollAll() {
		if(totalEmployees == 0) {
			System.out.println("No account to display");
			return;
		}
		System.out.println("Payroll Details --------");
		for(int i=0; i<totalEmployees; i++) {
			PayrollManager.generatePayroll(employees[i]);
			System.out.print("--------------");
		}
	}
	private static void applyLeave (Scanner sc) throws InvalidEmployeeIdException, InsufficientLeaveBalanceException {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee Id: ");
		int empId = sc.nextInt();
		Employee emp = findEmployee(empId);
		System.out.println("Enter the no. of leaves: ");
		int leave = sc.nextInt();
		if(emp.getLeaveBalance() < leave) {
			throw new InsufficientLeaveBalanceException ("Not enough leave balance");
		}
		emp.requestLeave(leave);
		System.out.println("Leave Applied Successfully");
	}

	private static Employee findEmployee(int empId) throws InvalidEmployeeIdException {
	// TODO Auto-generated method stub
		for (int i = 0; i < totalEmployees; i++) {
			if (employees[i].getEmpId() == empId) {
				return employees[i];
			}
		}
//		return null;
		throw new InvalidEmployeeIdException ("Employee with ID " + empId + " not found.");
	}
}
 