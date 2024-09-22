public class DateDemo{

	public static void main(String []args){

		Date d1 ;
		d1 = new Date();
		Date d2 = new Date();
		Date d3 = new Date();

		/*d1.getDate();
		d1.setDate(2,2,2022);
                d1.getDate(); */
		d1.setdate(25);
		d1.setMonth(12);
		d1.setYear(2000);
		System.out.println(d1.getdate());
		System.out.println(d1.getMonth());
		System.out.println(d1.getYear());
		
		Date.displayCount();
		}

}