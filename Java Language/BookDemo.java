public class BookDemo{

	public static void main(String []args){

		Book b1 = new Book("Entreprenuar");
		b1.setPrice(120);
		
		Book b2 = new Book("Mrutunjay");
		b2.setPrice(400);
		
		b1.display();
		b2.display();

	}

}