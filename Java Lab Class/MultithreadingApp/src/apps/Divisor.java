package com.testing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Divisor implements Runnable{
	
	private Thread t;
	private Integer number;
	private FileWriter fw;
	
	
	public Divisor(Integer number, FileWriter fw) {
		
		t = new Thread(this);
		this.number = number;
		this.fw = fw;
	}
	
	@Override
	public void run() {
		synchronized (fw) {
			try {
				
				//BufferedWriter bw = new BufferedWriter(new FileWriter(path,true));
				fw.write("Divisor of "+number+" : ");
				for(int i = 1; i<number; i++) {
					
					if(number%i ==  0) {
						
						fw.write(i+" ");
						//Thread.sleep(500);
					}
				}
				//.newLine();
				//fw.flush();
				System.out.println("Data Copied Successfully ..........");
				
				
			}catch(Exception e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	public Thread getT() {
		
		return t;
	}

}
