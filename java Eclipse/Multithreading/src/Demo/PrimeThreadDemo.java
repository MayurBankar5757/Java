package Demo;

import Entity.PrimeThread;

public class PrimeThreadDemo {

	public static void main(String []args) {
		
		
		
//		PrimeThread p = new PrimeThread(3,100);
//		
//		p.getT().start();
//		
		Thread t = new Thread(() ->{
			boolean flag = false;
			
			System.out.println("Prime Numbers : ");
			for(int i=1; i<100; i++) {
				if(i==3) {
					System.out.println(i);
				}
				
				for(int j =2; j<=i/2; j++) {
					
//					if(i==3) {
//						flag = true;
//						break;
//					}
					 if(i % j == 0) {
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
		});
		
		t.start();
	}
}
