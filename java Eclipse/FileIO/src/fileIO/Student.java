package fileIO;

public class Student {

	private int rollno;
	private String name;
	private int marks;
	
	public Student() {
		
		rollno =01;
		name = new String("ABC");
		marks = 00;
	}
	
	public Student(int rollno,String name,int marks) {
		this.rollno = rollno;
		this.marks = marks;
		this.name = new String( name);
		
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void display() {
		
		System.out.println("*******  ************");
		System.out.println("\nRoll No : "+rollno + "\nName : "+ name+ "\n Marks : " + marks);
	}
	
	public void  displayGrade() {
		System.out.print("Grade : ");
		if (getMarks() > 90) {

			System.out.print("Distinct");
		}
		else if (getMarks() > 80) {

			System.out.print("first class");
		}
		else if (getMarks() > 65) {

			System.out.print("second");
		}
		else if (getMarks() > 50) {

			System.out.print("pass");
		}
	}
}
