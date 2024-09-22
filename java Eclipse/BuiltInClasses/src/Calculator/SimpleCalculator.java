package Calculator;

public class SimpleCalculator implements iCalculator{
	
	
	
	@Override
	public double add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double divide(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	public static void main(String []args) {
		
		iCalculator c = new SimpleCalculator();
		
		System.out.println(c.add(10, 20));
		
		
	}
	

}

	