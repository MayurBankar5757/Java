package Demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import Entity.Divisors;

public class DivisorsDemo {

	public static void main(String []args) {
		
		
		
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter("D:\\know-it\\Divisor.txt"));
			Divisors d1 = new Divisors(32,br);
			Divisors d2 = new Divisors(45,br);
			Divisors d3 = new Divisors(50,br);
			
			d1.getT().start();
			d2.getT().start();
			d3.getT().start();
			
			d1.getT().join();
			d2.getT().join();
			d3.getT().join();

			System.out.println("Program Ended");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
