package fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineNumbers {
	
	public static void main(String []args) {
		BufferedReader br =null;
		try {
			br = new BufferedReader(new FileReader("D:\\Know-it\\javatext.txt"));
			
			String line;
			int count = 0 ;
			
			while((line = br.readLine())!=null) {
				
				
				count++;
				
				System.out.println(count+" " + line);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
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
