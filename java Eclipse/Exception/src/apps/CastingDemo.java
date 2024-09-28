package apps;

import office.staff.Admin;
import office.staff.Emp;
import office.staff.Programmer;
import office.staff.SalesManager;

public class CastingDemo {

	public static void main(String[] args) {
		Emp e1 = new SalesManager("Amit", 12, 1, 1999, 1010, 10000.0, 100000, 4.5);
		//e1.getTarget();   //error
		//call to subclass specific method
		//as e1 refers to SM, down casting is successful
		System.out.println(((SalesManager)e1).getTarget());
		
		Emp e2 = new Programmer("Bakul",12,12,1998,1020,12000.0,12.5,879.0);
		//dumb type casting
		//System.out.println(((SalesManager)e2).getTarget());
		//intelligent type casting
		if(e2 instanceof SalesManager)
			System.out.println(((SalesManager)e2).getTarget());
		else
			System.out.println("E2 is not SalesManager");
		
		Emp [] allemps = new Emp[3];
		allemps[0] = new SalesManager("Amit", 12, 1, 1999, 1010, 10000.0, 100000, 4.5);
		allemps[1] = new Programmer("Bakul",12,12,1998,1020,12000.0,12.5,879.0);
		allemps[2] = new Admin("Shantanu",11,11,1996,1030,9000,987.0);
		
		for(int i=0;i<allemps.length;i++) {
			System.out.print(allemps[i].getName()+" : ");
			if (allemps[i] instanceof SalesManager)
				System.out.print(((SalesManager)allemps[i]).getTarget());
			else if(allemps[i] instanceof Programmer)
				System.out.print(((Programmer)allemps[i]).getExtraHours());
			else if(allemps[i] instanceof Admin)
				System.out.print(((Admin)allemps[i]).getBonus());
			System.out.println();
		}
		
	}

}
