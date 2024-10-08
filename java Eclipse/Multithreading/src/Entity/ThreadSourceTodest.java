package Entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ThreadSourceTodest implements Runnable {

	private String source;
	private String dest;
	private Thread t;

	public ThreadSourceTodest(String source, String dest) {

		this.source = source;
	    this.dest = dest;
	    t = new Thread(this);

	}

	public Thread getT() {
		return t;
	}
	

	@Override
	public void run() {
		BufferedReader br1=null;
		BufferedWriter out=null;
		try {
		 br1 = new BufferedReader(new FileReader(source));
		 out = new BufferedWriter(new FileWriter(dest));

	     String line ="";

		while((line=br1.readLine())!=null){
		

			System.out.println(line);
			out.write(line);
			out.write("\n");
			

		}
		
	}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	

	}


