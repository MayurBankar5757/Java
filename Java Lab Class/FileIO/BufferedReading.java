newpackage apps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReading {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("D:/mydata/buffer.txt"));
		//reading data char by char
		/*int n;
		while( (n=br.read())!=-1)
			System.out.println((char)n);*/
		String line;
		int count = 0;
		String maxline="";
		int max = 0;
		while((line=br.readLine()) != null) {
			count++;
			System.out.println(count+". "+line);
			/*if(max < line.length()) {
				maxline = line;
				max = line.length();
			}*/
		}
		//System.out.println(maxline+" : "+max);
		br.close();

	}

}
