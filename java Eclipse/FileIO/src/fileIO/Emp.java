package fileIO;

import java.io.Serializable;

public class Emp implements Serializable {
	
	private int empid;
	private String name;
	private transient int age;
	private Date doj;
	
	
	
	public Emp(int empid, String name,int dd,int mm,int yy,int age) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		doj=new Date(dd,mm,yy);
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", age=" + age + ", doj=" + doj + "]";
	}
	
	

}
