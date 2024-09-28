
package office.staff;

import office.utility.Person;

public abstract class Emp extends Person {
	//extra state
	//state of emp - state of person+empid+salary
	private int empid;
	//private double salary;
	protected double salary;
	
	/*{
		System.out.println("initilaizer block");
	}*/
	
	public Emp() {
		//super();
		// TODO Auto-generated constructor stub
		super("xx",12,12,2000);
		empid = 0;
		salary = 0.0;
		//super();
	}
	
	public Emp(String name,int dd,int mm,int yy,int empid,double salary) {
		super(name,dd,mm,yy);   //super()
		this.empid = empid;
		this.salary = salary;
	}
	
	//overridden method
	public void display() {
		super.display();
		System.out.println("Empid : "+empid);
		System.out.println("Salary : "+salary);
	}
		
	public String toString() {
		return  super.toString()+"\nEmpid : "+empid+"\nSalary :"+salary;
	}
	
	/*public double calSalary() {
		//basic
		return salary;
	}*/
	
	public abstract double calSalary();
	
	public int getEmpid() {
		return empid;
	}

}
