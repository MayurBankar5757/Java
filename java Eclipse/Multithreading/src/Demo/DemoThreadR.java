package Demo;

import Entity.ThreadR;

public class DemoThreadR {

	public static void main(String []args) {
		
		Runnable r = new ThreadR();
		Thread t = new Thread(r);
		
		t.start();
	}
}
