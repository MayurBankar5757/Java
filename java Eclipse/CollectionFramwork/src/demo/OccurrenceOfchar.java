package demo;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfchar {

	public static void main(String[]args) {
		
		String str = "coccacola";
		
		Map <Character,Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch) ){
				
				map.put(ch,map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}
