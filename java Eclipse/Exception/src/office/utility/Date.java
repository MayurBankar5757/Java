package office.utility;

import java.io.Serializable;

public class Date implements Serializable {
	
     private int dd;
     private int mm;
     private int yy;    
     
     public Date() {
		//super();
		// TODO Auto-generated constructor stub
    	 dd=1;
    	 mm=1;
    	 yy=1970;
     }   
     
	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	/*public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd=dd;
	}*/
	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}
	public void display() {
    	 System.out.println(dd+"/"+mm+"/"+yy);
     }
	
	public String toString() {
		return dd+"/"+mm+"/"+yy;
	}

	
}












