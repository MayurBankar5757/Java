public class BankAccountDemo{

	public static void main(String []args){

		BankAccount b1 ;
		b1 = new BankAccount(10, 2000);

		b1.display();
	

		System.out.println(b1. balaceWithIntRate());
		b1.updateIntrestRate(8.0f);
		System.out.println(b1. balaceWithIntRate());
	}

}