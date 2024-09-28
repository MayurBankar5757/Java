package threadcomm;

//shared resource
public class Stock {
	int qtyProduced;   //incremented by producer
	int qtyConsumed;   //incremented by consumer
	boolean bProduced;
	
	//default  - qty = 0, bProduced - false
	
	//producer
	public synchronized void produce() {
		//qtyProduced++;
		if(bProduced) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//bProduced = false
		qtyProduced++;
		System.out.println("Produced : "+qtyProduced);
		bProduced = true;
		notify();     //waiting for producer to finish its task
	}
	
	//consumer
	public synchronized void consume() {
		//qtyConsumed++;
		if(!bProduced) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//bProduced = true	
		qtyConsumed++;
		System.out.println("Consumed : "+qtyConsumed);
		bProduced = false;
		notify();    //waiting for consumer to finish its task
	}
	
}
