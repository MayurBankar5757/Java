package apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

class CharInputFromKeyboard {
	public static void main(String[] args) {
		//InputStreamReader isr = new InputStreamReader(System.in);
		Reader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 'q' to quit");
			int n;
			int alphabetcount = 0;
			int digitcount = 0;
			while((n=br.read()) != 'q') {
				if(Character.isDigit(n))
					digitcount++;
			}
			//System.out.println((char)n);	
			System.out.println("Alphabet count : "+alphabetcount);
			System.out.println("Digit count : "+digitcount);
		}
		catch(IOException e) {			
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}





