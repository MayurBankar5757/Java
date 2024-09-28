package apps;

import office.staff.Admin;
import office.staff.Emp;
import office.staff.Programmer;
import office.staff.SalesManager;

public class StaffDemo {
	public static void main(String[] args) {
		//Emp e = new SalesManager("Amit", 12, 1, 1999, 1010, 10000.0, 100000, 4.5);
		//e.display();
		
		Emp [] allemps = new Emp[3];
		allemps[0] = new SalesManager("Amit", 12, 1, 1999, 1010, 10000.0, 100000, 4.5);
		allemps[1] = new Programmer("Bakul",12,12,1998,1020,12000.0,12.5,879.0);
		allemps[2] = new Admin("Shantanu",11,11,1996,1030,9000,987.0);
		
		/*for(int i=0;i<allemps.length;i++) {
			allemps[i].display();
			System.out.println("**********");
		}*/
		
		/*for(int i=0;i<allemps.length;i++) {
			System.out.println(allemps[i].toString());
			System.out.println("**********");
		}*/
		
		for(int i=0;i<allemps.length;i++) {
			System.out.println(allemps[i].calSalary());
			System.out.println("**********");
		}
		
	}
}
