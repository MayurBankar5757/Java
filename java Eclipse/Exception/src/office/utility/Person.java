package office.utility;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private Date dob;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
		name="NA";
		dob=new Date();
	}

	public Person(String name,int dd,int mm,int yy) {
		this.name=name;
		this.dob=new Date(dd, mm, yy);
	}

	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Date of birth : ");
		dob.display();
	}

	public String toString() {
		return "Name : "+name+"\nDate of birth : "+dob.toString();
	}
	
	public String getName() {
		return name;
	}
	
	
}
