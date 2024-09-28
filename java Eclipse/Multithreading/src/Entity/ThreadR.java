package Entity;

public class ThreadR implements Runnable {

	@Override
	public void run() {
		
		for(int i=0; i<5; i++) {
			
			System.out.println("Child Thread : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
