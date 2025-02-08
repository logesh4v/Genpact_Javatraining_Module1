package oopss;

public class Intern extends Employee {
    private double stipend;

    public Intern(String empName, int empId, String empDept, double stipend) {
        super(empName, empId, empDept);
        this.stipend = stipend;
    }

    public double getStipend() {
        return stipend;
    }

    public void setStipend(double stipend) {
        this.stipend = stipend;
    }
    
    @Override
    public void takeLeave(int days) {
        System.out.println("Interns are not allowed to take leave.");
    }

    @Override
    double calsalary() {
        return stipend;
    }
}
