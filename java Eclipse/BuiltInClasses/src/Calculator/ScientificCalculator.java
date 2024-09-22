package Calculator;

public class ScientificCalculator implements iScientificCalculator {

	@Override
	public double add(int a, int b) {
		
		return a+b;
	}

	@Override
	public double substract(int a, int b) {
	
		return a-b;
	}

	@Override
	public double multiply(int a, int b) {
	
		return a*b;
	}

	@Override
	public double divide(int a, int b) {
		
		return a/b;
	}

	@Override
	public double sin(double angle) {
		// TODO Auto-generated method stub
		return Math.sin(angle);
	}

	@Override
	public double cos(double angle) {
		// TODO Auto-generated method stub
		return Math.cos(angle);
	}

	@Override
	public double tan(double angle) {
		// TODO Auto-generated method stub
		return Math.tan(angle);
	}

	
	public static void main(String []args) {
		
		
		iScientificCalculator s = new ScientificCalculator();
		
		System.out.println(s.sin(0));
		System.out.println(s.cos(0));
		
	}
}
