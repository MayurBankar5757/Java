package Demo;

import Entity.ThreadController;

public class ThreadControllerDemo {
	
	public static void main(String []args) {
		
		ThreadController t = new ThreadController();
		t.getT().start();
		
	}

}
