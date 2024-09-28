package apps;

import threads.MyJob;

public class MyJobDemo {

	public static void main(String[] args) {
		MyJob j1 = new MyJob();
		j1.getT().start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Main thread : "+i);
			//Thread.sleep(500);
			try {
				Thread.sleep(500); //ms
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		//calling start method 2nd time on the same thread
		//raise IllegalThreadStateException
		//j1.getT().start();

	}

}
