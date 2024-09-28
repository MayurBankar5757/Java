package apps;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entities.Employee;

public class ObjectWriting {

	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		try {
			Employee e = new Employee(1001, "Bakul", 11, 11, 2012, 45);
			oos = new ObjectOutputStream(new FileOutputStream("D:/mydata/emps.dat"));
			oos.writeObject(e);//metadata+instance info
			System.out.println("Object is written");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
