package com.testing;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class DivisorDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println("Enter the Path : ");
		String path = br.readLine();
		FileWriter fw = new FileWriter(path);
		
		Divisor d = new Divisor(430, fw);
		Divisor d1 = new Divisor(298, fw);
		Divisor d2 = new Divisor(56, fw);
		/*Divisor d3 = new Divisor(334, path);
		Divisor d4 = new Divisor(25, path);
		Divisor d5 = new Divisor(456, path);
		Divisor d6 = new Divisor(876, path);
		Divisor d7 = new Divisor(12, path);
		Divisor d8 = new Divisor(24, path);*/
		
		d.getT().start();
		d1.getT().start();
		d2.getT().start();
		/*d3.getT().start();
		d4.getT().start();
		d5.getT().start();
		d6.getT().start();
		d7.getT().start();
		d8.getT().start();*/
		
		try {
			d.getT().join();
			d1.getT().join();
			d2.getT().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fw.close();
		
	}

}
