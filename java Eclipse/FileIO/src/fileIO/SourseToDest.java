package fileIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SourseToDest {

	public static void main(String[] args) {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter File Name ");

			String source = br.readLine();

			System.out.println("Enter Destination file Name ");

			String dest = br.readLine();

			FileOutputStream fos = new FileOutputStream(dest);// for writing in the file
			FileInputStream fis = new FileInputStream(source);// for reading from the file

//			String line;
			int n;
//			byte [] arr = new byte[10];

			System.out.println("Enter 'quit' to quit");

			while ((n = fis.read()) != -1) {

				fos.write(n);

			}

			fos.close();
			fis.close();
		}

		catch (IOException e) {

			e.printStackTrace();
		}

		

	}

}
