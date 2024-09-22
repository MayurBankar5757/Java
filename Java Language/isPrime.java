public class isPrime{

	public static void main(String []args){
	
	boolean flag = false;
	  int num = 20;

		for(int i=2; i<num/2; i++){
			
			if(num %i ==0){

				flag = true;
					
					break;
			}
			

		}

		if (flag == true){

			System.out.println("Not Prime Number ");
		}
		else{

		 System.out.println("Prime Number");

		}
           


	}
}