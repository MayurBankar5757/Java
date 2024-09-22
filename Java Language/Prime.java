public class Prime{

		public static void main(String [] args){
		
			int count =0;
			for(int i = 3 ; i< 100; i++){
				count =0;
				for(int j =2; j <= i/2; j++){

					if(i%j ==0){

					    count ++;	
					}  
				}
                        if(count > 2){

					System.out.println(i);
				}
			

			}

		}
}