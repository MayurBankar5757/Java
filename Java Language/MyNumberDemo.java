public class MyNumberDemo{

	public static void main(String []args){

		MyNumber m1;

		m1 = new MyNumber(20);

		System.out.println("Negative : "+m1.isNegative());
		System.out.println("Positive : "+m1.isPositive());
		System.out.println("Odd : "+m1.isOdd());
		System.out.println("Even : "+m1.isEven());
		System.out.println("Zero : "+m1.isZero());
		
	}
}