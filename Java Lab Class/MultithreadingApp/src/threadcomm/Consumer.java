package threadcomm;

public class Consumer implements Runnable {
	private Thread t;
	private Stock s;
	private boolean bRun;
	
	public Consumer(Stock s) {
		//3
		t = new Thread(this);
		bRun = true;
		this.s = s;
	}
	
	//4
	public void run() {
		while(bRun)    //bRun - false 
			s.consume();
	}
	
	//5
	public Thread getT() {
		return t;
	}
	
	public void stopNow() {
		bRun = false;
	}

}
