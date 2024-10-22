package entity;

public class Emp {   //implements Comparable<Emp> 

	private int empId;
	private String name;
	private int salary;
	private String dept;
	
	public Emp(int empId, String name, int salary,String dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
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



	public int getSalary() {
		return salary;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

//
//	@Override
//	public int compareTo(Emp o) {
//		int diff =0;
//		
//		if(this.salary>o.salary) {
//			
//			return 1;
//		}
//		else if(this.salary<o.salary) {
//			return -1;
//		}
//		else {
//			this.name.compareTo(o.name);
//		}
//		return diff;
//	}
//	
	
}
