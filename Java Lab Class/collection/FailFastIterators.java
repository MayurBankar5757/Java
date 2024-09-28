package demos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastIterators {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("welcome");
		names.add("object");
		names.add("java");
		names.add("final");
		names.add("const");
		names.add("by");
		names.add("transient");
		names.add("static");
		names.add("protected");
		
		//fail fast iterator - ConcurrentModificationException
		/*Iterator<String> itr = names.iterator();
		//names.remove(3);   //modification of underlying collection
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		//CopyOnWriteArrayList - fail safe iterator
		Iterator<String> itr = names.iterator();
		//names.remove(1);    -
		while(itr.hasNext()) {
			if(itr.next().length() < 3)
				itr.remove();   //itr.next()
			//System.out.println(itr.next());
		}
		System.out.println(names);
	}

}
