package apps;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.sql.Date;

public class UsingFileClass {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter path of the file ");
		String path = br.readLine();
		File f = new File(path);
		if(f.isDirectory()) {
			File[]files = f.listFiles();
			for(File file : files)
				System.out.println(file.getName());
		}
		else if(f.isFile()) {
			System.out.println("Size : "+f.length());
			System.out.println("Readable : "+f.canRead());
			//System.out.println("Last modified :"+f.lastModified());
			
			Date d = new Date(f.lastModified());
			System.out.println("Last modified : "+d);
			//System.out.println(f.);
			
		}

	}

}
