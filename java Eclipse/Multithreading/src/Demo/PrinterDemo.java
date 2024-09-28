package Demo;

import Entity.Printer;
import Entity.PrintingJob;

public class PrinterDemo {
	
	public static void main(String []args) {
		
		Printer p = new Printer();
		
		PrintingJob p1 = new PrintingJob("(","Welcome ",")",p);
		
		PrintingJob p2 = new PrintingJob("[","learning multithreading","]",p);
		
		PrintingJob p3 = new PrintingJob("{", "thread synchronization","}",p);
		
		p1.getT().start();
		p2.getT().start();
		p3.getT().start();
		
		try {
			p1.getT().join();
			p2.getT().join();
			p3.getT().join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("printing end");
		
	}

}
