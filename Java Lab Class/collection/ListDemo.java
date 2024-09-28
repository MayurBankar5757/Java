package demos;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		/*List l = new ArrayList<>();
		l.add(new String("welcome"));
		l.add(10);    //new Integer(10)
		l.add(new StringBuilder("xxx"));
		System.out.println(((Integer)l.get(2)) * (Integer)l.get(2));
	    */
		List<String> names = new LinkedList<>();
		//List<String> names = new ArrayList<>();
		/*while(!(line=br.readLine()).equals("quit"))
				names.add(line);*/
		
		names.add("welcome");
		names.add("object");
		names.add("java");
		names.add("final");
		names.add("const");
		names.add("transient");
		names.add("static");
		names.add("protected");
		names.add(null);
		names.add("interface");
		names.add("extends");
		names.add("java");
		names.add(null);
		
		//toString() method overridden in all collection classes
		System.out.println(names); //toString()
		System.out.println("************normal for loop");
		for(int i=0;i<names.size();i++)
			System.out.println(names.get(i));
		System.out.println("************for each loop");
		for(String s : names)
			System.out.println(s);
		System.out.println("************while loop");
		int i = 0;
		while(i<names.size()) {
			System.out.println(names.get(i));
			i++;
		}
		System.out.println("************using iterator");
		/*Iterator itr = names.iterator();
		while(itr.hasNext())
			System.out.println(((String)itr.next()).toUpperCase());
			*/
		Iterator<String> itr = names.iterator();
		while(itr.hasNext())
			System.out.println(itr.next().toUpperCase());
		System.out.println("************using listiterator");
		ListIterator<String> li = names.listIterator();
		while(li.hasNext())
			li.next();
		while(li.hasPrevious())
			System.out.println(li.previous());
		System.out.println("***********");
		//add at index
		names.add(1,"collections");
		System.out.println(names); //toString()
		
		//remove element by value
		names.remove("java");   //first occurrence is removed
		System.out.println(names); //toString()
		
		//remove element from index
		names.remove(4);
		System.out.println(names); //toString()
		
		//modify element at perticular index
		names.set(7, "threads");
		System.out.println(names); //toString()
		
		//utility class 
		//Collection - base interface, Collections - utility class
		//static methods
		Collections.shuffle(names);    //random reordering
		System.out.println(names); //toString()
		
		Collections.sort(names);
		//System.out.println(names); //toString()
		
		//System.out.println("Max element : "+Collections.max(names));
		//System.out.println("Min element : "+Collections.min(names));
		
		//collection is sorted
		System.out.println("Index of object : "+ Collections.binarySearch(names, "object"));
		
	}
}
