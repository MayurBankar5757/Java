package threads;

//1
public class CountDownJob implements Runnable {
	//2
	private Thread t;
	private int n;
	private String name;
	
	public CountDownJob(int n,String name) {
		//3
		t = new Thread(this);
		this.n = n;
		this.name = name;
	}
	
	//4
	public void run() {
		while(n > 0) {
			System.out.println(name+" counts down : "+n);
			n--;
		}
	}
	
	//5
	public Thread getT() {
		return t;
	}

}
