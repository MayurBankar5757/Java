public class Book {

	private int bookId;
	private String bookTitle;
	private float price;
	private static int count;

	static{

		count =0;

	}

	public Book(){

		bookId = 0;
		bookTitle = new String ("ABC");
		price = 100;

	}

	public Book(String bookTitle){

		bookId = ++count;
		this.bookTitle = new String (bookTitle);
		price = 100;

	}
	
	public void setPrice(float price){

		this.price = price;
	}

	public void display(){

		System.out.println("Book Id : " +bookId);
		System.out.println("Title   : " +bookTitle);

		System.out.println("Price : " +price);
		
	}

}