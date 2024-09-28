package Demo;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import Entity.ThreadSourceTodest;

public class ThreadSourceToDest {

	public static void main(String[] args) {
		
try {
			
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Enter source path");
			String path = br.readLine();
			System.out.println("Enter dest path");

			String dest =br.readLine();
			
			ThreadSourceTodest t = new ThreadSourceTodest(path,dest);
			t.getT().start();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
}