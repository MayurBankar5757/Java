public class BankAccount{

	private int accno;
	private float balance;
	private static float int_rate;

	public BankAccount(){
		
		accno = 1;
		balance = 10000;


	}

	public BankAccount(int accno,float balance){
		
		this.accno = accno;
		this.balance = balance;


	}

	public void display(){

		System.out.println("Accno : "+ accno + " Balance : " + balance);
		
	}

	static {

		int_rate = 7.25f;
	}
	
	public void updateIntrestRate(float newRateOfInterest){
	
			int_rate = newRateOfInterest;

	}

	public float balaceWithIntRate(){

		return  (balance + (balance * int_rate/100));
	}


	

	
}