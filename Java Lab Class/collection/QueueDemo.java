package demos;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueDemo {
	public static void main(String[] args) {		
		//compareTo of string class - priority order
		Queue<String> queue = new PriorityQueue<>();
		queue.add("java");
		queue.add("hello");
		queue.add("hi");
		queue.add("int");
		queue.add("float");
		queue.add("char");
		queue.add("double");		
		queue.add("final");
		queue.add("static");
		queue.add("java");
		for(String s : queue) {
			System.out.println(s);
		}
		System.out.println("*************");
		//queue.peek()  //retrieves element in the head of the queue
		//queue.poll()   //remove head of the queue
		System.out.println("Initial Size : "+queue.size());
		while(queue.size() > 0) {
			System.out.println(queue.poll());  //highest priority
			System.out.println("Size : "+queue.size());
		}
		

	}

}
