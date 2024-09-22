package exception;

import CustomException.InvalidCountryException;

public class UserRegstration {

	public static void main(String[] args) {

		registerUser("Suresh", "India");
	}

	public static void registerUser(String userName, String userCountry) {

		try {

			for (int i = 0; i < userCountry.length(); i++) {
				String Country = "India";
				if (userCountry.charAt(i) != Country.charAt(i)) {

					throw new InvalidCountryException();
				} else {
					System.out.println("User registration done Succesfully");
					break;
				}

			}
		} catch (InvalidCountryException e) {
			System.out.println("User outside India cannot registered");

		}

	}

}
