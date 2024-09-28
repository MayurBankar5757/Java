package Entity;

public class CountThread implements Runnable {
	
	private Thread t;
	private int n;
	private String name;
	
	public CountThread(int n, String name) {
		
		this.n = n;
		this.name = name;
		t = new Thread(this);
	}

	@Override
	public void run() {


		while(n>0) {
			
			System.out.println(name +" thread Count : "+ n);
			n--;
		}
		
	}

	public Thread getT() {
		return t;
	}

	
	

}
