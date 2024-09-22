package exception;

public class ArrayException {
	
	public static void main(String []args) {
		
		int [] arr = {10,34,38,28,59,22,4};
		
		int index = 10;
		try {
		
		System.out.println(arr[index]);
			
		}
		catch(NegativeArraySizeException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}