package Entity;

public class PrintingJob  implements Runnable {
	
	private Thread t;
	private String header;
	private String body;
	private String footer;
	private Printer p;
	
	public PrintingJob(String header, String body,String footer,Printer p) {
		
		this.header = header;
		this.body = body;
		this.footer = footer;
		this.p =p;
		t = new Thread(this);
	}

	@Override
	public void run() {
		
	//	p.print(header,body,footer);
	//	p.syncPrint(header,body,footer);
		p.syncPrint1(header, body, footer);
	}
	
	public Thread getT() {
		return t;
	}

}
