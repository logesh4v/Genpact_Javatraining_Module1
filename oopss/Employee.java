package oopss;

abstract class Employee {
    private String empName;
    private int empId;
    private String empDept;

    public Employee(String empName, int empId, String empDept) {
        this.empName = empName;
        this.empId = empId;
        this.empDept = empDept;
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

    public void displayEmpDetails() {
        System.out.println("Emp Name: " + empName);
        System.out.println("Emp ID: " + empId);
        System.out.println("Emp Dept: " + empDept);
    }
    public void takeLeave(int days) {
        System.out.println("Leave not applicable for this employee type.");
    }
    abstract double calsalary();
}