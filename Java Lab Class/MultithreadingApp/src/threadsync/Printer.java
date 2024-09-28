	package threadsync;

//shared resource
public class Printer {
	public void print(String header,String body,String footer) {		
		try {
			System.out.print(header);
			Thread.sleep(500);
			System.out.print(body);
			Thread.sleep(500);
			System.out.print(footer);
			System.out.println();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void syncPrint(String header,String body,String footer) {		
		//this - printer instance
		//starting the execution - acquire lock 
		synchronized (this) {
			try {
				System.out.print(header);
				Thread.sleep(500);
				System.out.print(body);
				Thread.sleep(500);
				System.out.print(footer);
				System.out.println();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		//come out block - release the lock
		
	}
	
	//no need to specify instance to be locked
	//instance for which method gets executed - will be locked
	public synchronized void syncPrint1(String header,String body,String footer) {		
		//this - printer instance
		//starting the execution - acquire lock 
		
			try {
				System.out.print(header);
				Thread.sleep(500);
				System.out.print(body);
				Thread.sleep(500);
				System.out.print(footer);
				System.out.println();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		
		//come out block - release the lock
		
	}
	
	
}
