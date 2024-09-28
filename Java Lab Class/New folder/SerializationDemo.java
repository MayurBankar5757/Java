package apps;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import office.staff.Admin;
import office.staff.Emp;
import office.staff.Programmer;
import office.staff.SalesManager;

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		Emp [] allemps = new Emp[3];
		allemps[0] = new SalesManager("Amit", 12, 1, 1999, 1010, 10000.0, 100000, 4.5, 10);
		allemps[1] = new Programmer("Bakul",12,12,1998,1020,12000.0,12.5,879.0, 8);
		allemps[2] = new Admin("Shantanu",11,11,1996,1030,9000,987.0);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/mydata/office.dat"));

		//oos.writeObject(allemps);
		for(Emp e : allemps)
			oos.writeObject(e);
		
		System.out.println("office data written");
		
		oos.close();
	}
	
	

}






