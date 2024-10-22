package staff;

import office.utility.Emp;

public class Admin extends Emp {

	
		private double allowance;

		public Admin() {
			super();
			
		}

		public Admin(String name, int dd, int mm, int yy, int eId, double basicSalary,double allowance) {
			super(name, dd, mm, yy, eId, basicSalary);
			this.allowance=allowance;
		}

		public Admin(double allowance) {
			super();
			this.allowance = allowance;
		}
		
		public double getAllowance() {
			
			return allowance;
		}
		@Override
		public String toString() {
			return "Admin [allowance=" + allowance + " \n toString()=" + super.toString() ;
		}
		@Override
		
		public double calculateSalary() {
//			return super.calculateSalary()+allowance; We make it abstract
			return basicSalary + allowance;
		}
		
		
		
}
