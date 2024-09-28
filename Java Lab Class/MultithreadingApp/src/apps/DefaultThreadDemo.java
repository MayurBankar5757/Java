package apps;
public class DefaultThreadDemo {
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName());  //main
		System.out.println(t.getPriority());   //5
		
		t.setName("Application thread");
		t.setPriority(Thread.MAX_PRIORITY);   // 1 to 10
		
		System.out.println(t.getName());  //Application thread
		System.out.println(t.getPriority());   //10

	}

}
