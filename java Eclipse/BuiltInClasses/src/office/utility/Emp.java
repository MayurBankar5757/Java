package office.utility;

public abstract class  Emp extends Person {

	private int eId;
//	private double basicSalary;
	protected double basicSalary;

	
	
	public Emp() {
		super();
		
	}
	public Emp(String name,int dd,int mm,int yy,int eId, double basicSalary) {
		super(name,dd,mm,yy);
		this.eId = eId;
		this.basicSalary = basicSalary;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public abstract  double calculateSalary();
	
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public String toString() {

		return "EmpId : " + eId + "Salary : "+basicSalary + super.toString();
	}
}
