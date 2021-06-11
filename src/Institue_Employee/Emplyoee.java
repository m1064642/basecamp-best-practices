package Institue_Employee;

public class Emplyoee {
	
	int empId;
	String empName;
	String deptName;
	int exp;
	String degination;
	
	public Emplyoee(int empId, String empName, String deptName, int exp, String degination) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
		this.exp = exp;
		this.degination = degination;
	}

	public void display() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Emplyoee ID  : "+empId);
		System.out.println("Emplyoee Name: "+empName);
		System.out.println("Department   : "+deptName);
		System.out.println("Experience   : "+exp);
		System.out.println("Degination   : "+degination);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
/*
 * 
	
	
 * */
 