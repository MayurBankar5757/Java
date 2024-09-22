package CustomException;

public class InvalidCountryException extends Exception {
	
	String msg ;
	
	public InvalidCountryException(){
		
		this.msg = "Invalid Country";
		
	}

	@Override
	public String getMessage() {
		
		return this.msg;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
