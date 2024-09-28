package Entity;

public class ThreadController implements Runnable {
	
	private Thread t ;
	
	public ThreadController() {
		t = new Thread(this);
	}

	@Override
	public void run() {
		
		for(int i=0; i<5; i++) {
			
			System.out.println(i );
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

	public Thread getT() {
		return t;
	}

	
	
}
