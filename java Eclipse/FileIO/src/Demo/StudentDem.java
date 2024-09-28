package Demo;
import fileIO.Student1;

public class StudentDem {
	
	public static void main(String []args) {
		
		Student1 [] student = new Student1[3];
		student[0] = new Student1("Amit", 12, 1, 1999, 1010, 10000.0, 100000, 4.5, 10);
		student[1] = new Student1("Bakul",12,12,1998,1020,12000.0,12.5,879.0, 8);
		student[2] = new Student1("Shantanu",11,11,1996,1030,9000,987.0);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/mydata/office.dat"));

		//oos.writeObject(allemps);
		for(Emp e : allemps)
			oos.writeObject(e);
		
		System.out.println("office data written");
		
		oos.close();
	}

}
