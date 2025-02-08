package oopss;


public interface EmployeeInterface {
	//no instance members
	void displayEmpDetails();
	double calSalary();
	//default method
	default void OrganizationPolicy() { //default behaviour
		System.out.println("ALL EMPLOYEES SHOULD FOLLOW COMPANY POLICIES. Work Time: 10 to 5");
	}
	default void jobLocation() { //utility methods (can't change)
		System.out.println("Address: Noida");
	}

	//static method
	static void CEOName() { //utility methods (can't change)
		System.out.println("Name of the CEO");
	}

 
}