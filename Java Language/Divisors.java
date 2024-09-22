public class Divisors{
	
	public static void main(String []args){
	
	  int a = 24;

	  System.out.print("Divisors of  " + a + " are : ");

		for(int i=1; i< a/2; i++){
		
			if( a % i==0){
		
			 System.out.print(i + " ");

			}

		}
	}
}