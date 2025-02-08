/*package oopss;

public class FullTimeEmployee extends Employee {
	
	private double basicSalary;
	private double bonus;

	public FullTimeEmployee(String empName, int empId, String empDept,double basicSal,double bonus) {
		super(empName, empId, empDept);
		this.basicSalary=basicSal;
		this.bonus=bonus;
		// TODO Auto-generated constructor stub
	}

	@Override
	double calsalary() {
		// TODO Auto-generated method stub
		return basicSalary+bonus;
	}
	//if any class has  one abstract class directly
	//or by inher

}


//parttimeemployee--calsal--hourly rate,number of days
//intern--call salary--stipend
//in all classes --emp,all inherited all getters setters
//test all in emmgtapp

package oopss;

public class FullTimeEmployee extends Employee {
    private double basicSalary;
    private double bonus;

    public FullTimeEmployee(String empName, int empId, String empDept, double basicSalary, double bonus) {
        super(empName, empId, empDept);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.leaveDays=0;
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
    
    public int getLeaveDays() {
        return getLeaveDays();
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
    
    @Override
    public void takeLeave(int days) {
        this.leaveDays += days;
        System.out.println("Leave taken for " + days + " days. Total leave days: " + leaveDays);
    }

    @Override
    double calsalary() {
        return basicSalary + bonus;
    }
}







package oopss;

public class FullTimeEmployee extends Employee {
    private double basicSalary;
    private double bonus;
    private int leaveDays;

    public FullTimeEmployee(String empName, int empId, String empDept, double basicSalary, double bonus) {
        super(empName, empId, empDept);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.leaveDays = 0;
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

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    @Override
    public void takeLeave(int days) {
        this.leaveDays += days;
        System.out.println("Leave taken for " + days + " days. Total leave days: " + leaveDays);
    }

    @Override
    double calsalary() {
        return basicSalary + bonus;
    }
}*/

package oopss;

public class FullTimeEmployee extends Employee {
	//if any class has atleast one abstract either directly or by inheritance that class is abstract class
	private double basicSalary;
	private double bonus;
	private int leaveDays;
 
	public FullTimeEmployee(String empName, int empId, String empDept, double basicSalary, double bonus, int leaveDays) {
		super(empName, empId, empDept);
		// TODO Auto-generated constructor stub
		this.basicSalary = basicSalary;
		this.bonus = bonus;
		this.leaveDays = leaveDays;
	}

	//getters-setters
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
	public int getLeaveDays() {
		return leaveDays;
	}
 
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
 
 
	double calSalary() {
		// TODO Auto-generated method stub
		return basicSalary + bonus;
	}
 
 
	public boolean applyLeave(int days) {
		if(leaveDays >= days) {
			leaveDays -= days;
			System.out.println("Full-time Leave granted");
			return true;
		}
		else {
			System.out.println("No leaves permissible");
			return false;
		}
	}

	@Override
	double calsalary() {
		// TODO Auto-generated method stub
		return 0;
	}

 
}