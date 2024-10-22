package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {
	
	public static void main(String []args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<String> l = new ArrayList<> ();
		String line;
		System.out.println("Enter Elements to add");
		
		for(int i =0; i<5; i++) {
			
			l.add(br.readLine());
		}
		
		
		
		for(String i :l) {
			System.out.println(i);
			
		}
		
		System.out.println("Enter element index to remove");
		
		int n = Integer.parseInt(br.readLine());
		System.out.println("Remove Element : "+ l.remove(n));
		
		// Dispay element size()
		
		for(int i=0; i<l.size();i++) {
			System.out.println(l.get(i));
			
		}
		
		// Display using Iterator
		
		System.out.println("Display using Iterator");
		Iterator <String> itr = l.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Display using ListIterator
		System.out.println("Display last to first");

		ListIterator<String> ltr =  l.listIterator();
		
		while(ltr.hasNext()) {
			ltr.next();
		}
		
		while(ltr.hasPrevious()) {
			
			System.out.println("using List Interator"+ltr.previous());
		}
		
		// Sort 
		Collections.sort(l);
		System.out.println("Sorted List : " +l);
		
		Collections.reverse(l);
		System.out.println(l);
		System.out.println("Enter String to Check");
		
		String str = br.readLine();
		
		for(String i :l) {
			
			if(i.equals(str)) {
				System.out.println("present at index"+ l.indexOf(i));
				break;
			}
			
		}
	}
}
