public class Array{

	public static void main(String []args){
		int max  ,min,avg , sum=0 ;

		int [] arr= new int [args.length];

		for(int i =0; i<args.length; i++){
			
			arr[i] = Integer.parseInt(args[i]);

		}
		
		for(int a : arr){

		    System.out.println(a);
		}

		
		
		
			max = arr[0];
			min = arr[0];

			for(int i = 0 ; i<arr.length; i++){
				
				
				sum +=arr[i];
				if (arr[i] > max ){
					
					max = arr[i];
				
				}
				else if( arr [i]<min && arr[i] < max ){

						min = arr[i];


					}

			}

 			avg = sum/arr.length;
		

	
		System.out.println("Max : "+max + " Min : "+ min + " Average : " + avg);
	
	}



}