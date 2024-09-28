package apps;

import threads.MyThread;

public class MyThreadDemo {

	public static void main(String[] args) {
		//main thread
		Thread t = new MyThread();
		t.start();   //run()
		
		for(int i=1;i<=5;i++) {
			System.out.println("Main thread : "+i);
			//Thread.sleep(500);
			try {
				Thread.sleep(500); //ms
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}

	}

}
