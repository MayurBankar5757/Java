package fileIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIO {

	

	public static void main(String[] args) {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		System.out.println("Enter 'q' to quit" );
		
//		String line;
		int digitCount =0;
		int alphaCount =0;
		try {
			while( (n=  br.read()) !='q') {
				
				
				
				if(Character.isDigit(n)) {
					digitCount++;
				}
				
				if(Character.isAlphabetic(n)) {
					
					alphaCount++;
				}
		

				
				
			}
			
			System.out.println("alphaCount : "+alphaCount);
			System.out.println("digitCount : "+digitCount);


		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
