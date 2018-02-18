package Vijayan.Spring;

//This is Bean/Model/POJO plain old java object
public class Employee {
	//Attributes
	int empID;
	String empName;
	String empAdd;
	
	//Methods
	public Employee() {
		
		System.out.println("Object Created");
	}
	
	public void myinit()
	{
		System.out.println("Object has been initialized");
	}
	
	public void mydestroy()
	{
		System.out.println("object destroyed");
	}
	
	
	public Employee(int empID, String empName, String empAdd) {
		this.empID = empID;
		this.empName = empName;
		this.empAdd = empAdd;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empAdd=" + empAdd + "]";
	}
	
	
	
}
