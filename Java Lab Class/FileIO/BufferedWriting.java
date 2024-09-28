package apps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferedWriting {

	public static void main(String[] args) throws Exception {

		//getting data from user thr std input - keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//writing data on buffer - flushed into file
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:/mydata/buffer.txt"));
		System.out.println("Enter 'quit' to stop");
		String line;
		while(!(line = br.readLine()).equals("quit")) {
			bw.write(line);
			bw.newLine();
		}	
		//bw.flush();	
		bw.close();  //internally flush
	}

}
