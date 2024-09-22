package CustomException;

public class PasswordTooShortException extends Exception {
	
	String msg ;
	
	public PasswordTooShortException() {
		this.msg = "Password too Long";
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
