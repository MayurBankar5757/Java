package CustomException;

public class PasswordTooLongException extends Exception {

	String msg ;
	
	public PasswordTooLongException() {
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
