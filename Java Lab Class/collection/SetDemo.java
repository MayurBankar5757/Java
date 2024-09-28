package demos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//Set<Integer> numbers = new HashSet<>();  //reordering - hashing
		//Set<Integer> numbers = new LinkedHashSet<>(); //preserves sequence- hashing
		Set<Integer> numbers = new TreeSet<>();  //reordering - sorting
		numbers.add(10);
		numbers.add(80);
		numbers.add(5);
		numbers.add(35);
		numbers.add(92);
		numbers.add(22);
		numbers.add(10);
		numbers.add(19);
		System.out.println(numbers);
		for(int n: numbers)
			System.out.println(n);
		System.out.println("************");
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("*********");
		numbers.remove(Integer.valueOf(22));
		System.out.println(numbers);
		

	}
}
