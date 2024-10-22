package exception;

import CustomException.InvalidNameException;

public class NameValidation {

	public static void main(String[] args) {

		String fName = "Abc";

		String lName = "XyY";

		try {

			if (Character.isUpperCase(fName.charAt(0)) && Character.isUpperCase(lName.charAt(0))) {

				for (int i = 1; i < fName.length(); i++) {

					if (!Character.isLowerCase(fName.charAt(i))) {
						System.out.println(" "+fName.charAt(i));
						throw new InvalidNameException();
						

					}

					
				}
				
				for (int i = 1; i < lName.length(); i++) {

					if (!Character.isLowerCase(lName.charAt(i))) {	
						System.out.println(" "+lName.charAt(i));
						throw new InvalidNameException();}
					

				}
				
				System.out.println("Welcome " +fName+" " + lName);
			}

			else {
				
				throw new InvalidNameException();
			}
			
		}

		catch (Exception e) {
			
			System.out.println("Invalid Name");
			e.printStackTrace();
		}
		
	
	}
}
