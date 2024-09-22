public class Point{

	private int x;
	private int y;


	public Point(){
	
	   	x = 1;
       		y = 1;
	
	}

	public void accept(int x,int y){

		this.x = x;
		this.y = y;
	}

	public void display(){

		System.out.println("["+ x +"," +y +"]");
	}
}