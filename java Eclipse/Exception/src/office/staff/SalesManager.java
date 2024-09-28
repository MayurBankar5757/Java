package office.staff;

import office.utility.ITraveller;

public class SalesManager extends Emp implements ITraveller  {
	//state received - name, dob, id, sal
	private double target;
	private double incentive; //in terms of percent
	private int daysTravelled;
	
	public SalesManager() {
		//super();
		//target = comm = 0.0;
	}

	public SalesManager(String name, int dd, int mm, int yy, int empid, double salary, double target,
			double incentive, int daysTravelled) {
		super(name, dd, mm, yy, empid, salary);
		this.target = target;
		this.incentive = incentive;
		this.daysTravelled = daysTravelled;
	}
	
	//overridden
	public void display() {
		super.display();
		System.out.println("Target : "+target);
		System.out.println("Incentive :"+incentive);
	}

	public String toString() {
		return super.toString()+"\nTarget : "+target+"\nIncentive : "+incentive;
	}

	//overridden
	public double calSalary() {
		//basic + incentive
		//return super.calSalary()+(target*incentive/100);	
		return salary+(target*incentive/100)+calcualteTA();	
	}
	
	//not overridden
	public double getTarget() {
		return target;
	}

	@Override
	public double calcualteTA() {
		//DA in rs*no of days travelled
		return   (salary*DA/100) * daysTravelled;
	}
	
	public int getDaysTravelled() {
		return daysTravelled;
	}
	
	/*public SalesManager(String name, int dd,int mm,int yy, int empid, double salary, double target,double incentive ) {
		
	}*/
	
	

}
