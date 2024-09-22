package utility;

public class Person{


	private int pId;
	private String name;
	


	public Person(){
	
		pId = 1;
		name = new String("ABC");
	
	}
	public Person(int pId, String name){
	
		this.pId = pId;
		this.name = new String(name);
	
	}

	public void display(){

		System.out.println(" Id : "+pId);
		System.out.println(" Name  : "+ name);
	


	}
}