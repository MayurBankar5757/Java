package threads;

//1. implements Runnable
public class MyJob implements Runnable {
	//2. Declaring thread instance - controller
	private Thread t;
	
	public MyJob() {
		//3. Instantiate t
		t = new Thread(this);
	}
	//4. Override run method
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
	//5. Provide getter method
	public Thread getT() {
		return t;
	}

}
