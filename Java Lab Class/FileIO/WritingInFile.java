package apps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 accept data - keyboard
 write data within a file 
 */
public class WritingInFile {
	public static void main(String[] args) {
		BufferedReader br = null;
		FileOutputStream fos = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			fos = new FileOutputStream("D:/mydata/data.txt",true);
			System.out.println("Enter 'quit' to stop ");
			String line;
			while(!(line = br.readLine()).equals("quit"))
				fos.write((line+"\n").getBytes());
		}		
		catch(IOException e) {
			System.out.println("File is not found");
		}
		/*catch(IOException e) {
			System.out.println("read/write error");
		}*/
		finally {
			try {
				if(fos != null)
					fos.close();
				br.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
