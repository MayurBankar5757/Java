package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map <Integer,String> map = new HashMap<>();
		
		map.put(1, "Suraj");
		map.put(2, "Vishal");
		map.put(3, "Ajay");
		map.put(4, "Akshay");
		map.put(5, "sanket");
		map.put(6, "Suraj");
		map.put(7, "Suraj");
		map.put(8, null);
		
		Set <Map.Entry<Integer,String>> set = map.entrySet();
		System.out.println(map.size());
		System.out.println((set.size()));
		

		
		for(Map.Entry<Integer, String> s : set) {
			//System.out.println(s.getKey() +": "+ s.getValue());
			System.out.println(s);

		}
		
		Iterator <Map.Entry<Integer,String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry<Integer, String>  s =itr.next();
			
			System.out.println(s.getKey() + " : " + s.getValue());
		}
		
	}

}
