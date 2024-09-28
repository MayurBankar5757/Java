package Demo;

import Entity.CountThread;

public class CountDemo {

	public static void main(String []args) throws InterruptedException {
		
		CountThread r1 = new CountThread(500,"first");
		
		CountThread r2 = new CountThread(600,"second");
		CountThread r3 = new CountThread(900,"Third");
		
		
		System.out.println("Main thread started ");

		
		r1.getT().start();
		r2.getT().start();
		r3.getT().start();
		
		r1.getT().join();
		r2.getT().join();
		r3.getT().join();
		
		
		
		System.out.println("Main thread ended ");

		
	}
}