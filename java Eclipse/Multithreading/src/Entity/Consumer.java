package Entity;

public class Consumer implements Runnable {

	private Thread t;
	private Stock s;
	private  boolean cRun;
	
	public Consumer(Stock s) {
		t = new Thread(this);
		this.s = s;
		cRun = true;
	}
	
	
	
	
	
	@Override
	public void run() {
		
		while(cRun) {
			
			s.consume();
		}
		
	}

	public Thread getT() {
		return t;
	}
	
}
