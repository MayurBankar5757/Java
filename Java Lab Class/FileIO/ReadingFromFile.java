package apps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		/*FileInputStream fis = null;
		fis = new FileInputStream("D:\\mydata\\data.txt");
		int n;
		/*while((n = fis.read()) != -1)
			System.out.println((char)n);*/
		/*byte [] arr = new byte[10];
		while((n = fis.read(arr)) != -1)
			System.out.println(new String(arr)); 
		fis.close();*/
		/*
		 reading data line by line
		 */
	    
		FileReader fr = null;
		fr = new FileReader("D:\\mydata\\data.txt");
		int n;
		/*while((n=fr.read())!=-1)
			System.out.println((char)n);*/
		char [] arr = new char[8];
		while((n=fr.read(arr))!=-1)
			System.out.println(new String(arr));
		fr.close();
			
		
		
	}

}
