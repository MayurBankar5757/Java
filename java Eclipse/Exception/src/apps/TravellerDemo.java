package apps;

import office.staff.Admin;
import office.staff.Emp;
import office.staff.Programmer;
import office.staff.SalesManager;
import office.utility.ITraveller;

public class TravellerDemo {
	public static void main(String[] args) {
		Emp [] allemps = new Emp[3];
		allemps[0] = new SalesManager("Amit", 12, 1, 1999, 1010, 10000.0, 100000, 4.5, 10);
		allemps[1] = new Programmer("Bakul",12,12,1998,1020,12000.0,12.5,879.0, 8);
		allemps[2] = new Admin("Shantanu",11,11,1996,1030,9000,987.0);
		
		for(int i=0;i<allemps.length;i++) {
			System.out.println("Gross salary : "+allemps[i].calSalary());
		}
		System.out.println("Travelling allowance : ");
		for(int i=0;i<allemps.length;i++) {
			if(allemps[i] instanceof ITraveller) {
				System.out.print("Empid : "+allemps[i].getEmpid());
				if(allemps[i] instanceof SalesManager)
					System.out.print("\tDays : "+ ((SalesManager)allemps[i]).getDaysTravelled() );
				else if(allemps[i] instanceof Programmer)
					System.out.print("\tDays : "+ ((Programmer)allemps[i]).getDaysTravelled() );
				System.out.print("\tTA : "+ ((ITraveller)allemps[i]).calcualteTA());
				System.out.println();
			}
			
		}
		

	}

}
