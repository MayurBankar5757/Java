public class Box{

	private int height;
	private int width;
	private int depth;
	

	public Box(){

		height =10;
		width = 10;
		depth = 10;
	}
	
	public void display(){

		System.out.println(height +" " + width +" " + depth);
	}
	
	public int  calVolume(){
	
	      	return height * width * depth;
	}

  }