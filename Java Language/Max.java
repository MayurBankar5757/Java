public class Max{

	public static void main(String []args){
	
	int a = 20;
	int b = 30;
	int c = 40;
 	int max;

		max = (a>b ? a:b)>(b<c ? c:b)? a : c;
          System.out.println(" Max Number : " + max);

	if(a>b){
	
		if(a>c){
			
		System.out.println(" Greater Number : " + a);
		
		}
	}
	else if (b>c){

		System.out.println(" Greater Number : " + b);
	}
	else{
	
		System.out.println(" Greater Number : " + c);
	
	}
	}
}