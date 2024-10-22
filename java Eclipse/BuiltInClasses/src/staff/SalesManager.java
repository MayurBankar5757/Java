package staff;

import office.utility.Emp;

public class SalesManager extends Emp implements iTraveller {

	private double salesTarget;
	private double perCommission;
	private String passportNum;
	private int travelHours;
	public SalesManager() {
		super();

	}

	public SalesManager(String name, int dd, int mm, int yy, int eId, double basicSalary, double salesTarget,
			double perCommission) {
		super(name, dd, mm, yy, eId, basicSalary);

		this.salesTarget = salesTarget;
		this.perCommission = perCommission;

	}

	public double getTarget() {

		return salesTarget;
	}

	

	@Override

	public double calculateSalary() {
//		return super.calculateSalary()+(salesTarget*perCommission/100); we make it abstract 
		return basicSalary + (salesTarget * perCommission / 100);
	}

	public String toString() {

		return "SalesTarget : " + salesTarget + " \n Percommision : " + perCommission;
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
