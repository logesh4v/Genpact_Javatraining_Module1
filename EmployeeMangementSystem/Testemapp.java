package EmployeeMangementSystem;
 
import java.util.Scanner;
 
public class Testemapp {
 
		
		private static Employee[] employees;
		private static int totalEmployees=0;
		private static int maxEmployees=5;
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			employees=new Employee[5];
			while(true) {
				System.out.println("Employee Menu: ");
				System.out.println("Press 1 - Create new employee data ");
				System.out.println("Press 2 - Display Info ");
				System.out.println("Press 3 - payroll with the Taxes to be paid ");
				System.out.println("Press 4 - Exit ");
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
					System.out.print("Enter Name : ");
					String name = scanner.next();
					System.out.print("Enter Employee Id(Unique key) : ");
					int id= scanner.nextInt();
					System.out.print("Enter Employee Department : ");
					String dept=scanner.next();
					System.out.print("Enter Employement Basic salary : ");
					double basesal=scanner.nextDouble();
					System.out.print("Enter leaves can be taken: ");
					int leaves=scanner.nextInt();
					System.out.println("Choose employement type");
					System.out.println("Press 1 : Full Time Role");
					System.out.println("Press 2 : Part Time Role");
					System.out.println("Press 3 : Intern Role");
					System.out.println("Press 4 : Manager Role");
					System.out.println("Press 5 : Exit");
					int choose=scanner.nextInt();
					switch(choose) {
					case 1:
						System.out.println("Enter Bonus : ");
						double bonus=scanner.nextDouble();
						employees[totalEmployees]=new FullTimeEmployee(name,id,dept,basesal,leaves,bonus);
						break;
					case 2:
						System.out.println("Enter number of hours: ");
						int hours=scanner.nextInt();
						System.out.println("Enter hourly Rate: ");
						double hourlyrate=scanner.nextDouble();
						employees[totalEmployees]=new PartTimeEmployee(name,id,dept,basesal,leaves,hourlyrate,hours);
						break;
					case 3:
						System.out.println("Enter Stipend: ");
						double stipend=scanner.nextDouble();
						employees[totalEmployees]=new InternClass(name,id,dept,basesal,leaves,stipend);
						break;
					case 4:
						System.out.println("Enter Bonus : ");
						double bonus1=scanner.nextDouble();
						employees[totalEmployees]=new ManagerEmployee(name,id,dept,basesal,leaves,bonus1);
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
//						else {
							for(int i=0;i<totalEmployees;i++) {
						employees[i].displayInfo();
						System.out.println("-----------------");
					}
					}

				public static void PayrollInfo() {
						if(totalEmployees==0) {
							System.out.println("No employee to display");
							return;
						}
						for(int i=0;i<totalEmployees;i++) {
						PayrollManager.generatePayroll(employees[i]);
						System.out.println("-----------------");
					}
						
				
				}
 
				}

