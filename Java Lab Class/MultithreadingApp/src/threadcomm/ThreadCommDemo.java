package threadcomm;
public class ThreadCommDemo {
	public static void main(String[] args) {
		//shared resource
		Stock s = new Stock();
		
		//multiple threads
		//newly created state
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		
		//runnable
		p.getT().start();
		c.getT().start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//p.getT().stop();
		p.stopNow();
		c.stopNow();
		
		try {
			p.getT().join();
			c.getT().join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total qty produced : "+s.qtyProduced);
		System.out.println("Total qty consumed : "+s.qtyConsumed);

	}

}
