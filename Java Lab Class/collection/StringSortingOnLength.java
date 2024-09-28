package demos;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StringSortingOnLength {

	public static void main(String[] args) {
		//short - lambda expression
		Comparator strcmp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				//return o2.compareTo(o1);
				int diff = o1.length() - o2.length();
				if(diff == 0) {
					diff = o1.compareTo(o2);
				}
				return diff;
			}					
		};	
		
		Set<String> words = new TreeSet<>(strcmp);
		words.add("hi");
		words.add("object");
		words.add("welcome");
		words.add("boolean");
		words.add("float");
		words.add("by");
		words.add("real");
		words.add("int");
		words.add("double");
		words.add("static");
		System.out.println(words);
	}

}
