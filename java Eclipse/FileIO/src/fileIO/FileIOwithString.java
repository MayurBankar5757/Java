package fileIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIOwithString {
	
	public static void main(String []args)  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		int max =0;
		String maxLine = null;
		
		System.out.println("Enter 'quit' to quit");
		
		try {
			while(!(line= br.readLine()).equals("quit")) {
				
				//System.out.println(line);
				
				if(max< line.length()) {
					max = line.length();
					maxLine = line;
				}
				
				
			}
			System.out.println("Line : "+maxLine+"\nmax : "+max );
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
