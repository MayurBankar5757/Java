package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class MaxChar {

	public static void main(String[] args) {

	try {
		
		BufferedReader	br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter File Name : ");
		String FileName = br.readLine();
//	FileInputStream fis = new FileInputStream(FileName);// read from file

		 BufferedReader br1 = new BufferedReader(new FileReader("D:\\know-it\\"+FileName+".txt"));

		String line;
		String maxLine = "";
		int max = 0;
		while ((line = br1.readLine()) != null) {

			if(max < line.length()) {
				maxLine = line;
				max = line.length();
			}

		}
		System.out.println("MaxLine : " + maxLine);

	}
	catch(Exception e) {
		e.printStackTrace();
	}

	}
  
	
	}


