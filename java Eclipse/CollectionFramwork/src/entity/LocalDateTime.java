package entity;

public class LocalDateTime  {//implements Comparable<LocalDateTime>

	private int dd;
	private int mm;
	private int yy;
	
	
	public LocalDateTime(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}


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


	@Override
	public String toString() {
		return "LocalDateTime [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}


//	@Override
//	public int compareTo(LocalDateTime o) {
//		
//		
//		
//		if(this.dd> o.dd) {
//			return 1;
//		}
//		else if(this.dd < o.dd) {
//			
//			return -1;
//		}
//		else {
//			
//			if(this.mm > o.mm) {
//				return 1;
//			}
//			else if(this.mm<o.mm) {
//				return -1;
//			}
//			else {
//				
//				if(this.yy > o.yy) {
//					return 1;
//				}
//				else if(this.yy< o.yy) {
//					return -1;
//				}
//			}
//		}
//		
//		return 0;
//	}
//	
	
	
	
	
}
