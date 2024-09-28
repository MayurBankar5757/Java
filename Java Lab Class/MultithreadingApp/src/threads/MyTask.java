package threads;

public class MyTask implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child thread : "+i);
			try {
				Thread.sleep(500); //ms
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}

	}

}
