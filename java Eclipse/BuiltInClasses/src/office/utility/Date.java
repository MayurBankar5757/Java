package office.utility;

public class Date {
	
	private int dd;
	private int mm;
	private int yy;
	
	public Date () {
		dd = 01;
		mm = 01;
		yy = 2012;
	}
	public Date (int dd,int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public int getDate() {
		return dd;
	}
	public int getMonth() {
		return mm;
	}
	public int getYear() {
		return yy;
	}
	public void setDate(int dd) {
		this.dd = dd;
	}
	public void setMonth(int mm) {
		this.mm = mm;
	}
	public void setYear(int yy) {
		this.yy= yy;
	}
	
	public String toString() {
		
		return dd+"/"+mm+"/"+yy+"\n";
	}

}
