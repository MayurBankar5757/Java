package Entity;

import java.io.BufferedWriter;
import java.io.IOException;

public class Divisors implements Runnable {

	private int num;
	private Thread t;
	BufferedWriter f;

	public Divisors(int num, BufferedWriter f) {
		this.num = num;
		t = new Thread(this);
		this.f = f;
	}

	@Override
	public void run() {

//		System.out.println(FindDivisors(num));
//		List<Integer> l = FindDivisors(num);
//		ObjectOutputStream oos = null;
		synchronized (f) {
			try {
				
				//BufferedWriter bw = new BufferedWriter(new FileWriter(path,true));
				f.write("Divisor of "+num+" : ");
				for(int i = 1; i<=num; i++) {
					
					if(num%i ==  0) {
						
						f.write(i+" ");
						//Thread.sleep(500);
					}
				}
				f.newLine();
				//fw.flush();
				System.out.println("Data Copied Successfully ..........");
				
				f.flush();
			}
			catch(IOException e) {
				e.printStackTrace();
				}
			}

	}

//	public List<Integer> FindDivisors(int num) {
//		
//		List <Integer> l = new ArrayList<>();
//		
//		for(int i=1; i<=num; i++) {
//			
//			if(num%i ==0) {
//				
//				l.add(i);
//			}
//		}
//		
//		return l;
//		
//	}
	public synchronized void print() {

		try {

			// BufferedWriter br = new BufferedWriter(new
			// FileWriter("D:\\know-t\\Divisor.txt"));
			// BufferedReader br1 = new BufferedReader(new
			// FileReader("D:\\know-it\\Divisor.txt"));

//			 oos = new ObjectOutputStream(new FileOutputStream("D:\\know-it\\Divisor.txt"));
//			 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\\\know-it\\\\Divisor.txt"));
//			
//			 Object obj = ois.readObject();
//			 System.out.println(obj);
//			for(int i=0; i<l.size(); i++) {
//				
//				oos.write(l.get(i));
//			//	br.write(l.get(i));
//				//System.out.println(l.get(i)); 
//			
//				
//				}

			
			for (int i = 1; i <= num; i++) {

				if (num % i == 0) {

					f.write(i + " ");
					System.out.println(i);
				}
			}
			f.newLine();

//			
			f.flush();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public Thread getT() {
		return t;
	}

}
