package threadsync;

//1
public class PrintingJob implements Runnable {
	//2
	private Thread t;
	Printer p;
	String header,body,footer;
	
	public PrintingJob(Printer p, String header,String body,String footer) {
		//3
		t= new Thread(this);
		this.p = p;
		this.header = header;
		this.body = body;
		this.footer = footer;
	}
	
	//4
	public void run() {
		//p.print(header, body, footer);
		//p.syncPrint(header, body, footer);
		p.syncPrint1(header, body, footer);
	}
	
	//5
	public Thread getT() {
		return t;
	}

}
