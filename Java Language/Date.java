package utility;
public class Date{

	private int date ;
	private int month;
	private int year;
	private static int count;
	
	public Date(){
	
		date =1;
		month =	1;
		year =1970;
                count++;
		
	}

	public Date(int date,int month,int year){

	 	this.date =date;
		this.month = month;
		this.year = year;
		count++;
	}
         public void  getDate(){

	 	System.out.println(date + "/"+month+"/"+year);
	}

	public void setDate(int date,int month,int year){

		this.date = date;
		this.month = month;
		this.year = year;
	}
	public int getdate(){

		return date;
	}
	
	public int getMonth(){

		return month;
	}

	public int getYear(){

		return year;
	}


	public void setdate(int date){

		this.date = date;
	}

        public void setMonth (int month){

		this.month = month;
	}
	
	public void setYear(int year){
 		this.year = year;
	}

	public static void displayCount(){


		System.out.println("Count : "+count);

	}

	

}