package CustomException;

public class InvalidPasswordException extends Exception {

	String msg;

	public InvalidPasswordException(){
		
		this.msg = "Invalid Password";
		
	}

	@Override
	public String getMessage() {

		return this.msg;
	}

	@Override
	public String toString() {
		
		return this.msg;
	}

}
