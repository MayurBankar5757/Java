package apps;

import threads.CountDownJob;

public class CountDownJobDemo {

	public static void main(String[] args) {
		//main thread
		//newly created state		
		CountDownJob j1 = new CountDownJob(550, "first");
		CountDownJob j2 = new CountDownJob(700, "second");
		CountDownJob j3 = new CountDownJob(980, "third");
		
		System.out.println("Counting down job begins.....");
		//runnable
		j1.getT().start();
		j2.getT().start();
		j3.getT().start();
		
		//main thread - j1, j2 and j3 finish the task
		
		System.out.println("j1 live : "+j1.getT().isAlive());
		System.out.println("j2 live : "+j2.getT().isAlive());
		System.out.println("j3 live : "+j3.getT().isAlive());
		try {
			j1.getT().join();
			j2.getT().join();
			j3.getT().join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("j1 live : "+j1.getT().isAlive());
		System.out.println("j2 live : "+j2.getT().isAlive());
		System.out.println("j3 live : "+j3.getT().isAlive());
		System.out.println("Counting down job ends.....");
	}

}
