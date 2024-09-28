package demos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(10, "hello");   //one element - 2 objects - Integer, String
		map.put(34, "welcome");
		map.put(27, "object");
		map.put(37, "html");
		map.put(43, "css");		
		map.put(55, "javascript");
		map.put(83, "hello");
		map.put(10, "jquery");
		map.put(null, null);
		map.put(89, null);
		System.out.println(map);   //toString()		
		System.out.println("Value for key 55 : "+map.get(55));  //55 present
		System.out.println("Value for key 99 : "+map.get(99));   //99 not present - null
		
		if(map.containsKey(55))
			 System.out.println("key 55 present : "+map.get(55));
		map.remove(89);
		System.out.println(map);   //toString()	
		
		//converting map to set
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		for( Map.Entry<Integer, String>  me : set)
			System.out.println(me.getKey()+" : "+me.getValue());
		System.out.println("****************");
		Iterator<Map.Entry<Integer,String>> itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,String> me = itr.next();
			System.out.println(me.getKey()+" : "+me.getValue());
			//System.out.println(itr.next().getKey()+" : "+itr.next().getValue());
		}
		
	}

}






