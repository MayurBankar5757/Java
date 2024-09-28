package threadcomm;

//1
public class Producer implements Runnable {
	//2
	private Thread t;
	private Stock s;
	private boolean bRun;
	
	public Producer(Stock s) {
		//3
		t = new Thread(this);
		bRun = true;
		this.s = s;
	}
	
	//4
	public void run() {
		while(bRun)    //bRun - false 
			s.produce();
	}
	
	//5
	public Thread getT() {
		return t;
	}
	
	public void stopNow() {
		bRun = false;
	}

}
