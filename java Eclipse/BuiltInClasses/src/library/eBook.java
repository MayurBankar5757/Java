package library;

import Book1.Book;

public class eBook extends Book {

	private String downloadUrl;
	private double sizeInMBs;
	
	public eBook() {
		super();
		downloadUrl = "NA";
		sizeInMBs = 0.0;
	}
	public eBook(String bookTitle,float price,String dowloadUrl,double sizeInMBs) {
		super(bookTitle,price);
		this.downloadUrl = dowloadUrl;
		this.sizeInMBs = sizeInMBs;
		
		
	}
	
	public String toString() {
		
		return super.toString()+"\n Url : "+ downloadUrl + "\n size : "+sizeInMBs;
		
	}
}