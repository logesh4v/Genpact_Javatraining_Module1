package oopss;

public class PartTime extends Employee {
    private double hourlyRate;
    private int numberOfDays;

    public PartTime(String empName, int empId, String empDept, double hourlyRate, int numberOfDays) {
        super(empName, empId, empDept);
        this.hourlyRate = hourlyRate;
        this.numberOfDays = numberOfDays;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    double calsalary() {
        return hourlyRate * numberOfDays * 8;
    }
}
