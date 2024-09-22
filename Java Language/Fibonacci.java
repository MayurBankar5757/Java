public class Fibonacci{

		public static void main(String [] args){
		
			int firstNum =0;
			int secondNum = 1;
			int thirdNum =0 , temp;
			System.out.print("Fibonacci Series : "+ firstNum + " " + secondNum + " ");
			

			for(int i=2; i < 10; i++){

			 thirdNum = firstNum + secondNum;
			 System.out.print(thirdNum + " ");
			 firstNum = secondNum;
			 secondNum = thirdNum;	


			}

			
		
		}
}