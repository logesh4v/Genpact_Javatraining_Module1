package EmployeeMangementSystem;
import java.util.*;


public class EMApplication {
    private static Employee11[] employees;
    private static int totalEmployees = 0;
    private static int maxEmployees = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employees = new Employee11[maxEmployees];
        while (true) {
            System.out.println("Employee Application Menu");
            System.out.println("Press 1: Create an employee");
            System.out.println("Press 2: Display all employees");
            System.out.println("Press 3: Display payroll info");
            System.out.println("Press 4: Request leave for an employee");
            System.out.println("Press 5: Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    createEmployee(sc);
                    break;
                case 2:
                    displayAllEmployees();
                    break;
                case 3:
                    displayPayrollInfo();
                    break;
                case 4:
                    requestLeave(sc);
                    break;
                case 5:
                    System.out.println("Exiting from system!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice. Enter a number from 1 to 5");
            }
        }
    }

    public static void createEmployee(Scanner sc) {
        if (totalEmployees >= maxEmployees) {
            System.out.println("Cannot create new employee");
            return;
        }
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter Employee ID");
        String empId = sc.next();
        System.out.println("Enter Salary");
        double salary = sc.nextDouble();
        System.out.println("Choose type of employee: ");
        System.out.println("Press 1: Part-Time Employee");
        System.out.println("Press 2: Intern");
        System.out.println("Press 3: Full-Time Employee");
        System.out.println("Press 4: Manager");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                employees[totalEmployees] = new PartTimeEmployee11(name, empId, salary);
                break;
            case 2:
                employees[totalEmployees] = new Intern11(name, empId, salary);
                break;
            case 3:
                employees[totalEmployees] = new FullTimeEmployee11(name, empId, salary);
                break;
            case 4:
                employees[totalEmployees] = new Manager(name, empId, salary);
                break;
            default:
                System.out.println("Invalid Choice. Enter a number from 1 to 4");
                return;
        }
        System.out.println("Employee created successfully");
        totalEmployees++;
    }

    public static void displayAllEmployees() {
        if (totalEmployees == 0) {
            System.out.println("No employees to display");
            return;
        }
        System.out.println("Employee Details --------");
        for (int i = 0; i < totalEmployees; i++) {
            employees[i].displayDetails();
            System.out.println("--------------");
        }
    }

    public static void displayPayrollInfo() {
        if (totalEmployees == 0) {
            System.out.println("No employees to display payroll info");
            return;
        }
        System.out.println("Payroll Information --------");
        for (int i = 0; i < totalEmployees; i++) {
            employees[i].displayPayrollInfo();
            System.out.println("--------------");
        }
    }

   public static void requestLeave(Scanner sc) {
        System.out.println("Enter Employee ID");
        String empId = sc.next();
        Employee11 employee = findEmployee(empId);
        if (employee != null) {
            System.out.println("Enter number of leave days requested");
            int leaveDays = sc.nextInt();
            employee.requestLeave(leaveDays);
        } else {
            System.out.println("Employee not found");
        }
    }

    public static Employee11 findEmployee(String empId) {
        for (int i = 0; i < totalEmployees; i++) {
            if (employees[i].getEmpId().equals(empId)) {
                return employees[i];
            }
        }
        return null;
    }
} 

class Employee11 {
    private String name;
    private String empId;
    private double salary;
    private int leaveBalance = 5;

    public Employee11(String name, String empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
        System.out.println("Leave Balance: " + leaveBalance);
    }

    public void displayPayrollInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public void requestLeave(int leaveDays) {
        if (leaveDays <= leaveBalance) {
            leaveBalance -= leaveDays;
            System.out.println("Leave approved for " + leaveDays + " days. Remaining leave balance: " + leaveBalance);
        } else {
            System.out.println("Insufficient leave balance. Leave request denied.");
        }
    }
}

class PartTimeEmployee11 extends Employee11 {
    public PartTimeEmployee11(String name, String empId, double salary) {
        super(name, empId, salary);
    }
}

class Intern11 extends Employee11 {
    public Intern11(String name, String empId, double salary) {
        super(name, empId, salary);
    }
}

class FullTimeEmployee11 extends Employee11 {
    public FullTimeEmployee11(String name, String empId, double salary) {
        super(name, empId, salary);
    }
}

class Manager extends Employee11 {
    public Manager(String name, String empId, double salary) {
        super(name, empId, salary);
    }
}
