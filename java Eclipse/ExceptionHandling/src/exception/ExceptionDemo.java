package exception;

public class ExceptionDemo {

	public static void main(String []args) {
		
		try {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println(num1/num2);
		}
		catch(ArithmeticException e) {
			
			e.printStackTrace();
			
			
		}
		catch(NumberFormatException  | ArrayIndexOutOfBoundsException e ) {
			e.printStackTrace();
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
}
