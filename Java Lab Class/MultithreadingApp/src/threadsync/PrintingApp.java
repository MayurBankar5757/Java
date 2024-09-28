package threadsync;

public class PrintingApp {

	public static void main(String[] args) {
		//shared resource
		Printer p = new Printer();
		
		//newly created
		PrintingJob j1 = new PrintingJob(p, "(", "welcome to java", ")");
		PrintingJob j2 = new PrintingJob(p, "[", "learning multithreading", "]");
		PrintingJob j3 = new PrintingJob(p, "{", "thread synchronization", "}");
		//synchronization
		
		//runnable
		j1.getT().start();
		j2.getT().start();
		j3.getT().start();
		
		try {
			j1.getT().join();
			j2.getT().join();
			j3.getT().join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Printing ends....");

	}

}
