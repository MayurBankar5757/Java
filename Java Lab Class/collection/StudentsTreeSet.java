package demos;

import java.util.Set;
import java.util.TreeSet;

import entities.Student;
public class StudentsTreeSet {
	public static void main(String[] args) {
		//student - Comparable
		Set<Student> studs = new TreeSet<>();
		
		//compareTo - element getting inserted with all existing elements
		studs.add(new Student(89,"vaibhav",78.9f));
		studs.add(new Student(56,"ashish",87.2f));
		studs.add(new Student(34,"Viahan",90.3f));
		studs.add(new Student(12,"hitesh",67.7f));
		studs.add(new Student(27,"anhijeet",77.5f));
		studs.add(new Student(78,"bakul",76.9f));
		studs.add(new Student(78,"bakul",76.9f));
		studs.add(new Student(65,"snehal",76.9f));
		studs.add(new Student(19,"ashish",87.2f));
		
		System.out.println("No of elements : "+studs.size());
		for(Student st : studs) {
			System.out.println(st);
		}
		

	}

}
