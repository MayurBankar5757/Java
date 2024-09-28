package demo;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String [] args) {
		
		List<String>  s = new ArrayList<>();
		
		s.add("xyz");
		s.add("shubham");
		s.add("xyz");
		s.add("outout");
		s.add("shubham");
		s.add("yadav");
		s.add("xyz");
		s.add("shubham");
		s.add("sanket");
		
		System.out.println(s);
		
		for(int i=0; i<s.size(); i++) {
			for(int j=0; j<s.size()&& i!=j; j++) {
			
			if(s.get(i).equals(s.get(j))) {
				
				s.remove(i);
			}
			}
		}
		System.out.println();
		System.out.println("******");
		System.out.println(s);
		
	}
}
