package Entity;

public class DefaultThread {

	public static void main(String []args) {
//		Thread t= new Thread ();
		
		System.out.println(Thread.currentThread());
		
		System.out.println(Thread.currentThread().getPriority());
	}
}
