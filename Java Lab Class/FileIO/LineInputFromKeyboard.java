package apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class LineInputFromKeyboard {

	public static void main(String[] args) {
		Reader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 'quit' to quit");
			String line;
			int max = 0;
			String maxline = null;
			while(!(line=((BufferedReader)br).readLine()).equals("quit")) {
				if(max < line.length()) {
					max = line.length();
					maxline = line;
				}
			}
			System.out.println(maxline + ":" +max);	
				
			//System.out.println(line);			
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
