package demo;

import java.util.HashSet;
import java.util.Set;

import entity.Student;

public class StudentDemo {

	public static void main(String []args) {
		
		Set <Student> st = new HashSet<>();
		
		st.add(new Student(1,"suraj","pune",72.9f));
		st.add(new Student(2,"Rohan","pune",82.9f));
		st.add(new Student(3,"Tanmay","Mumbai",75.0f));
		st.add(new Student(1,"Rajesh","Nashik",52.9f));
		st.add(new Student(1,"kiran","Nagpur",92.9f));
		st.add(new Student(1,"lokesh","Nagpur",72.9f));
		st.add(new Student(5,"lokesh","Nagpur",72.9f));

		for(Student s : st) {
			System.out.println(s);
		}
		
	}
}
