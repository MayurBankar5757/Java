package apps;

import threads.MyTask;

public class MyTaskDemo {

	public static void main(String[] args) {
		Runnable r = new MyTask();               //task
		Thread t = new Thread(r);  //r - task    //controller
		t.start();    //r.run()
		
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
