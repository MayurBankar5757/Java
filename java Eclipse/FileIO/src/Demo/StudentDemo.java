package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import fileIO.Student;

public class StudentDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student Data");

		int rollno =Integer.parseInt(br.readLine()) ;
		System.out.println("Enter Student marks");
		int marks = Integer.parseInt(br.readLine());
		System.out.println("Enter Student name");
		String name = br.readLine();
		

		Student s1 = new Student(rollno, name, marks);
		s1.display();
		s1.displayGrade();
		

		

	}
}
