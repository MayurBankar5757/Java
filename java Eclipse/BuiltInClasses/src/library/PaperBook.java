package library;

import Book1.Book;
import office.utility.Date;

public class PaperBook extends Book{
	
	private int numOfPages;
	Date dateOfPublication;
	
	public PaperBook() {
		dateOfPublication = new Date();
		numOfPages = 10;
	
		
	}

	public PaperBook(String bookTitle,float price,int numOfPages,int dd,int mm,int yy) {
		super(bookTitle,price);
		this.numOfPages = numOfPages;
		dateOfPublication = new Date(dd,mm,yy);
	}
	
	public String toString () {
		
		return super.toString()+ "\n"+dateOfPublication.toString()+"\n numOfPages : "+numOfPages;
	}
	
	
	
	

}
