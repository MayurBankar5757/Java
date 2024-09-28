package demos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		//s.push(60);
		s.display();
		
		List<Number> list = new ArrayList<>();
		list.add(45);
		list.add(78);
		list.add(13);
		list.add(41);
		list.add(23);
		sum(list);
	}
	
	static void sum(Collection<Number> cl) {
		double sum = 0;
		for(Number n : cl)
			sum+=n.intValue();
		System.out.println(sum);
	}

}
