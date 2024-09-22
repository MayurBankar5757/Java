public class CalculatorDemo{

	public static void main(String[]args){

		Calculator c1;

		c1 = new Calculator();
		
		System.out.println(c1.addition());

		System.out.println(c1.substraction());

		System.out.println(c1.multiplication());

		System.out.println(c1.division());
	}
}