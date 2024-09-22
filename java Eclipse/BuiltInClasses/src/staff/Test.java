package staff;

import office.utility.Emp;


public class Test {
	
	
		public  static void showMoreDetails(Emp [] e1) {
			
			for(int i=0; i<e1.length;i++) {
				
				if(e1[i] instanceof SalesManager) {
					
			     System.out.println("\tSales Target : "+((SalesManager)e1[i]).getTarget());   
				}
				else if(e1[i] instanceof Programmer) {
					
				     System.out.println("\tProject Name : "+((Programmer)e1[i]).getProjectName());   
					}
				else if(e1[i] instanceof Admin) {
					
				     System.out.println("\t Allowance : "+((Admin)e1[i]).getAllowance());   
					}
			}
			
		}
		
		public static void main(String []args) {
			Emp [] e1 = {new SalesManager("ABC",02,02,2012,01,10000,20,10),
					
					new Programmer("ABC",02,02,2012,01,10000,"Auto Generate",19,2),
					new Admin("ABC",02,02,2012,01,10000,20.0)
		
					};

				Test.showMoreDetails(e1);
			
			
			
		}
}
