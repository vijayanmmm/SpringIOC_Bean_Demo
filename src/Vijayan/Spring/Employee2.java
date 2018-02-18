package Vijayan.Spring;

//This is Bean/Model/POJO plain old java object
public class Employee2 {
	//Attributes
	int empID;
	String empName;
	Address address;
	
	//Methods
	public Employee2() {
		
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
	
	public Employee2(int empID, String empName, Address address) {
		
		this.empID = empID;
		this.empName = empName;
		this.address = address;
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

	@Override
	public String toString() {
		return "Employee2 [empID=" + empID + ", empName=" + empName + ", address=" + address
				+ "]";
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
		
}

class Address
{
	String Street;
	String State;
	int zipcode;
	public Address(String street, String state, int zipcode) {
		
		Street = street;
		State = state;
		this.zipcode = zipcode;
	}
	public Address() {
		
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", State=" + State + ", zipcode=" + zipcode + "]";
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	
}
