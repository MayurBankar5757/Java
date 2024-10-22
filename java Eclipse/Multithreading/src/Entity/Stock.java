package Entity;

public class Stock {
	
	int qtyProduced;
	int qtyConsumed;
	boolean bProduced;

	public synchronized void produce() {
		
		if(bProduced) {
			try {
				
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		qtyProduced++;
		System.out.println("Produced : "+qtyProduced);
		bProduced = true;
		notify();     
	}
	
	public synchronized void consume() {
		
		if(!bProduced) {}
		try {
			this.wait();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		qtyConsumed++;
		System.out.println("Consumer : "+qtyConsumed);
		bProduced = false;
		notify();
		
	}
}
