package mypkg;

public class Employee implements Comparable<Employee>{
	
	private int empId;
	private String name;
	private int marks;
	
	public Employee() {
		
	}

	public Employee(int empId, String name, int marks) {
		super();
		this.empId = empId;
		this.name = name;
		this.marks = marks;
	}
	
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Employee e) {
		return this.empId-e.empId;
	}
	
	
}
