package demo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String [] args) {
		
		Queue<String > q = new PriorityQueue<>();
		
		q.add("Suraj");
		q.add("aniket");
		q.add("Rohan");
		q.add("Aditya");
		q.add("Sanket");
		q.add("Suraj");

		System.out.println(q.peek());// only return the head of the queue
		System.out.println(q.size());
		System.out.println(q.poll());// return the head of the queue and remove the head
		System.out.println(q.size());
		for(String s :q) {
			
			System.out.println(s);
			
		}
		System.out.println("************");

//       for(String s :q) {
//			
//    	   	q.remove(); // concurrent excution exception
//		}
       
       while(q.size()>0) {
    	   System.out.println(q.poll());
    	   System.out.println("Size : "+q.size());
       }
		
	}
}
