package fileIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	
	public static void main(String []args) {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
			
			System.out.println("Enter string ");
			String str;
			try {
				str = br.readLine();
				for(int i=0; i<str.length(); i++) {
					int count=0;
					
					for(int j=0; j<str.length(); j++) {
						
						if(str.charAt(i)== str.charAt(j)) {
							
							count++;
						}
					}
					if(count==0) {
						System.out.print(str.charAt(i));
					}
				}
			} catch (IOException e) {
				
				
				e.printStackTrace();
			}
			
			
			
			
			
			
			
		} 
		
		
		
	
}