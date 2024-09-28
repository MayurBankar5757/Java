package office.staff;

public class Admin extends Emp {
	//state received - name, dob, id, sal
	private double bonus;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, int dd, int mm, int yy, int empid, double salary, double bonus) {
		super(name, dd, mm, yy, empid, salary);
		this.bonus = bonus;
	}
	
	//overridden
		public void display() {
			super.display();
			System.out.println("Bonus : "+bonus);
		}
		
		//overridden
		public String toString() {
			return super.toString()+"\nBonus :"+bonus;
		}
		
		//overridden
		public double calSalary() {
			// TODO Auto-generated method stub
			// basic + bonus
			//return super.calSalary()+ bonus;
			return salary+ bonus;
		}
		//not overridden
		public double getBonus() {
			return bonus;
		}
	
}
