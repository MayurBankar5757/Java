public class SumDigit{

		public static void main(String []args){

			int num = 2536,n,sum =0 ,sum2=0;

			while(num > 0 ){
				
				n = num %10;
				sum = sum +n;
				num = num/10;	
						
			}
			
			while(sum >0){

			     	n= sum %10;
                             	sum2 = sum2 + n;
				sum = sum/10;

			}

			System.out.println("Sum : " + sum2);
		}
}