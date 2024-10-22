package fileIO;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class File {

	

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter File Name ");

		try {

			String FileName = br.readLine();
			FileOutputStream fos = new FileOutputStream(FileName); // write in file
			FileInputStream fis = new FileInputStream(FileName);// read from file

			

			String line;

			System.out.println("Enter 'quit' to quit");

			while (!(line = br.readLine()).equals("quit")) {

				fos.write(line.getBytes());

			}
			System.out.println("*******************************************");
			while (fis.read()!= -1) {

				System.out.println((char)(fis.read()));

			}
			
			fos.close();
			fis.close();
		}

		catch (IOException e) {

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