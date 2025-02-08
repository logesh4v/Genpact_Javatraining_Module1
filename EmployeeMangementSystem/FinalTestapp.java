package EmployeeMangementSystem;
	import java.util.Scanner;
	//import InvalidEmployeeIdException;
	public class FinalTestapp {
			private static Employee[] employees;
			private static int totalEmployees=0;
			private static int maxEmployees=5;
			public static void main(String[] args) throws InvalidEmployeeIdException, InsufficientLeaveBalanceException {
				Scanner scanner=new Scanner(System.in);
				employees=new Employee[5];
				while(true) {
					System.out.println("Employee Menu: ");
					System.out.println("Press 1 - Create new employee data ");
					System.out.println("Press 2 - Display Information ");
					System.out.println("Press 3 - Display payroll information ");
					System.out.println("Press 4 - Exit ");
					System.out.println("Press 5 for Leave");				
					int choice=scanner.nextInt();
					switch (choice) {
					case 1:
						createEmp(scanner);
						break;
					case 2:
						displayInfo();
						break;
					case 3:
						PayrollInfo();
						break;
					case 5:
						applyLeave(scanner);
						break;
						
					case 4:
						System.out.println("You exited successfully");
						scanner.close();
						return;
					default:
						System.out.println("Enter valid option");
					}
				}
	}
				public static void createEmp(Scanner scanner) {
						if(totalEmployees>=maxEmployees) {
							System.out.println("Cannot create more accounts");
							return;
						}
						System.out.print("Enter Employee Name : ");
						String empName = scanner.next();
						System.out.print("Enter Employee Id : ");
						int empId= scanner.nextInt();
						System.out.print("Enter Employee Department : ");
						String department=scanner.next();
						System.out.print("Enter Employement Base salary : ");
						double baseSalary=scanner.nextDouble();
						System.out.print("Enter the Number of leave days: ");
						int leaveBalance=scanner.nextInt();
						System.out.println("Choose employement type");
						System.out.println("Press 1 : Full Time Employee");
						System.out.println("Press 2 : Part Time Employee");
						System.out.println("Press 3 : Intern");
						System.out.println("Press 4 : Manager Employee");
						System.out.println("Press 5 : Exit");
						int choose=scanner.nextInt();
						switch(choose) {
						case 1:
							System.out.println("Enter Bonus : ");
							double bonus=scanner.nextDouble();
							employees[totalEmployees]=new FullTimeEmployee(empName,empId,department,baseSalary,leaveBalance,bonus);
							break;
						case 2:
							System.out.println("Enter number of hours: ");
							int hours=scanner.nextInt();
							System.out.println("Enter hourly Rate: ");
							double hourlyrate=scanner.nextDouble();
							employees[totalEmployees]=new PartTimeEmployee(empName,empId,department,baseSalary,leaveBalance,hourlyrate,hours);
							break;
						case 3:
							System.out.println("Enter Stipend: ");
							double stipend=scanner.nextDouble();
							employees[totalEmployees]=new InternClass(empName,empId,department,baseSalary,leaveBalance,stipend);
							break;
						case 4:
							System.out.println("Enter Bonus : ");
							double bonuss=scanner.nextDouble();
							employees[totalEmployees]=new ManagerEmployee(empName,empId,department,baseSalary,leaveBalance,bonuss);
							break;
						case 5:
							System.out.println("Exited Successfully");
							break;
						}
						totalEmployees++;
						System.out.println("Employee created successfully");
		           }
						public static void displayInfo() {
							if(totalEmployees==0) {
								System.out.println("No employee to display");
							}
								for(int i=0;i<totalEmployees;i++) {
							employees[i].displayInfo();
							System.out.println("______________________");
						}
	}
	 
					public static void PayrollInfo() {
							if(totalEmployees==0) {
								System.out.println("No employee to display");
								return;
							}
							for(int i=0;i<totalEmployees;i++) {
							PayrollManager.generatePayroll(employees[i]);
							System.out.println("______________________");
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
//						return null;
						throw new InvalidEmployeeIdException ("Employee with ID " + empId + " not found.");
					}	
	}

	
	

