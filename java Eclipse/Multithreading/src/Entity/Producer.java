package Entity;

public class Producer implements Runnable {

	private Stock s;
	private boolean bRun;
	private Thread t;
	
	public Producer(Stock s) {
		bRun = true;
		t = new Thread(this);
		this.s =s;
	}

	@Override
	public void run() {
		while(bRun) {
			s.produce();
		}
		
	}
	
	public Thread getT() {
		return t;
	}
	public void stopNow() {
		bRun =false;
	}
}
