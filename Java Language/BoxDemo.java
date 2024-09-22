public class BoxDemo{

	public static void main(String []args){

		Box []b1 ;
		b1 = new Box[3];

		/*b1.Display();
		System.out.println(b1.calVolume());*/

		 b1[0] = new Box();
		 b1[1]  = new Box();
		 b1[2] = new Box();
 
		for(Box b : b1){
		
			System.out.println(b.calVolume());
			
		}

		
	}

		

  }