package Calculator;

public class MyNumber implements BasicintOperations , AdvIntOperations {
	int num;
	
	public MyNumber(int num) {
		this.num = num;
	}

	@Override
	public boolean isPrime(int num) {
		
		for(int i =2; i<num/2;i++) {
			
			if(num %i ==0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public double calFactorial(int num) {
		int fact =1;
		for( int i=1; i<num; i++) {
			
			fact *=i;
			
			
		}
		return fact;
	}

	@Override
	public boolean isOdd(int num) {
		
		if(num %2 ==0) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isEven(int num) {
		if(num %2 ==0) {
			return true;
		}
		return false;
	}
	
	public static void main(String []args) {
		
		BasicintOperations b = new MyNumber(10);
		System.out.println(b.isOdd(10));
		
		AdvIntOperations b1 = new MyNumber(10);
		System.out.println(b1.isPrime(11));
		System.out.println(b1.calFactorial(5));
		
		
	}

}
