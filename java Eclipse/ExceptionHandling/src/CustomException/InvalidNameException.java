package CustomException;

public class InvalidNameException extends Exception {
	
	String msg;
	public InvalidNameException() {
		this.msg = "Invalid Name";
	}

	@Override
	public String getMessage() {
		
		return this.msg;
	}

	@Override
	public String toString() {
		
		return super.toString();
	}
	

}
