package office.staff;

import office.utility.ITraveller;

public class Programmer extends Emp implements ITraveller{
	//state received - name, dob, id, sal
	private double extraHours;
	private double chargesPerHour;
	private int daysTravelled;
	
	public Programmer() {
		super();
		extraHours = chargesPerHour = 0.0;
	}

	public Programmer(String name, int dd, int mm, int yy, int empid, double salary, double extraHours,
			double chargesPerHour, int daysTravelled) {
		super(name, dd, mm, yy, empid, salary);
		this.extraHours = extraHours;
		this.chargesPerHour = chargesPerHour;
		this.daysTravelled = daysTravelled;
	}
	
	//overridden
	public void display() {
		super.display();
		System.out.println("Extra hours : "+extraHours);
		System.out.println("Charges per hour : "+chargesPerHour);
	}
	
	//overridden
	public String toString() {
		return super.toString()+"\nExtra hours :"+extraHours+"\nCharges per hour :"+chargesPerHour;
	}

	//overridden
	public double calSalary() {
		// TODO Auto-generated method stub
		// basic + extra hours charges
		//return super.calSalary()+ (extraHours*chargesPerHour);
		return salary+ (extraHours*chargesPerHour) + calcualteTA();
	}
	
	//not overridden
	public double getExtraHours() {
		return extraHours;
	}

	@Override
	public double calcualteTA() {
		//DA in rs * days travelled
		return (salary*DA/100)*daysTravelled;
	}
	
	public int getDaysTravelled() {
		return daysTravelled;
	}
	
	
}
