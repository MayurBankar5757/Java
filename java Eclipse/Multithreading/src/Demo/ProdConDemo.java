package Demo;

import Entity.Consumer;
import Entity.Producer;
import Entity.Stock;

public class ProdConDemo {

	public static void main(String []args) {
		Stock s = new Stock();
		System.out.println("Main start");
		Producer p1 = new Producer(s);
		
		Consumer c = new Consumer(s);
		
		c.getT().start();
		p1.getT().start();
		
	
		try {
			c.getT().join();
			p1.getT().join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("program Ended");
		
		
	}
}
