package demo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class VowelsString {

	public static void main(String []args) {
		
		Comparator<String> c = ((String s1, String s2)->{
			
			int maxS1 =0;
			int maxS2 = 0;
		
			for(int i=0; i<s1.length(); i++) {
				char ch =	s1.charAt(i);
				

				if(ch == 'a'|| ch =='i'|| ch =='o'|| ch == 'u' || ch =='e') {
					maxS1++;
				}
				
			}
			for(int i=0; i<s2.length(); i++) {
				char ch =	s2.charAt(i);
				

				if(ch == 'a'|| ch =='i'|| ch =='o'|| ch == 'u' || ch =='e') {
					maxS2++;
				}
				
			}
			
			if(maxS1 > maxS2) {
				return 1;
				
			}
			else if(maxS1 < maxS2) {
				return -1;
			}
			else {
				s1.compareTo(s2);
			}
			return 0;
		});
		
		Set <String> s = new TreeSet<>();
		
		s.add("Suraj");
		s.add("Sanket");
		s.add("Aditya");
		
		
		
	}
}
