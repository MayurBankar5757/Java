package staff;

import office.utility.Emp;

public class Programmer extends Emp implements iTraveller {

		
		private String projectTitle;
		private int extraHours ;
		private double chargePerExtraHour;
		private String passportNum;
		private int travelHours;
		
		
		public Programmer() {
			super();
			
		}

		public Programmer(String name, int dd, int mm, int yy, int eId, double basicSalary,String projectTitle, int extraHours, double chargePerExtraHour) {
			super(name, dd, mm, yy, eId, basicSalary);
			this.projectTitle = projectTitle;
			this.extraHours = extraHours;
			this.chargePerExtraHour = chargePerExtraHour;
			
		}

		public Programmer(String projectTitle, int extraHours, double chargePerExtraHour) {
			super();
			this.projectTitle = projectTitle;
			this.extraHours = extraHours;
			this.chargePerExtraHour = chargePerExtraHour;
		}
		@Override
		
		public double calculateSalary() {
//			return super.calculateSalary()+(chargePerExtraHour *extraHours); we make it abstract
			return basicSalary + (chargePerExtraHour *extraHours);
		}
		
		public String getProjectName() {
			
			return projectTitle;
		}
		
		public String toString () {
			return "\n Project Title : "+projectTitle + "\n Extra Hours : "+extraHours +"\n charge per Extra Hour : "+ chargePerExtraHour;
		}

		@Override
		public String getPassportDetails() {
			return passportNum;
		}

		@Override
		public int getTravelHours() {
			return travelHours;
		}
		
}
