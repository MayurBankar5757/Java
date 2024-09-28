package apps;

import office.staff.Emp;
import office.utility.Person;

public class EmpDemo {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.display();
		
		Emp e2 = new Emp("Amit",11,11,2000,1001,10000.0);
		e2.display();
		System.out.println("********");
		//super class reference - sub class instance
		Person p = new Emp("Vaibhav",19,10,1987,1002,12000.0);
		//sub class reference - super class instance
		//Emp e = new Person();
		//case of dynamic binding
		//type of object referred by p
		
		p.display();
		System.out.println("********");
		System.out.println(p.toString());
		
	}

}
