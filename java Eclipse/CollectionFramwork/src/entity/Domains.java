package entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Domains {

	public static void main(String []args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\Know-it\\emails.txt"));
			int n;
			String line;
//			System.out.println("line");
			
			
			Map <String,Integer> map = new HashMap<>();
			
			while ((line = br.readLine()) != null) {
             //   System.out.println(line);
                
                
             
                
                //for(int i=0 ;i<line.length(); i++) {
                	
                	int n2 = line.indexOf("@");
                	
                	String str = line.substring(n2+1);
                	
                	if(map.containsKey(str)) {
                		map.put(str,map.get(str)+1);
                	}
                	else {
                		map.put(str, 1);
                	}
                	
                //}
            }
			Set<Entry<String, Integer>> set = map.entrySet();
			
			

			
			for(Entry<String, Integer> s : set) {
				System.out.println(s.getKey() +": "+ s.getValue());
				

			}
		//	System.out.println(map);
			
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
