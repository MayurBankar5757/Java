package Entity;

public class PrimeThread implements Runnable {

	private int start;
	private int end;
	private Thread t;
	
	public PrimeThread(int start,int end) {
		
		this.start = start;
		this.end = end;
		t = new Thread(this);
		
	}

	@Override
	public void run() {
		
		System.out.println("Prime Numbers : ");
		boolean flag =true;
		
		for(int i=start ; i<end; i++) {
		   
			
			
			for(int j=2; j<= i/2; j++) {
				
			
				if(i % j ==0) {
					
					flag = false;
					break;
				}
				else {
					flag = true;
				}
			}
			
			if(flag) {
				System.out.println(i);
			}
		}
		
		
		
	}

	public Thread getT() {
		return t;
	}

	
	
	
	
	
}
