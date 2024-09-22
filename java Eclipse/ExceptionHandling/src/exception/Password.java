package exception;

import CustomException.PasswordTooLongException;
import CustomException.PasswordTooShortException;

public class Password {
	
	public static void main(String [] args) {
		String pass = "pass@123";
		
		try{
			
			if(  pass.length() < 12) {
				throw new PasswordTooLongException();	
			}
			else if (pass.length()<8) {
				throw new PasswordTooShortException();
			}
			
			
		}
		catch(PasswordTooShortException | PasswordTooLongException e) {
			
			System.out.println(e.getMessage());
			
		}
		catch(Exception e) {
			

			System.out.println(e.getMessage());
		}
		
		
	}

}
