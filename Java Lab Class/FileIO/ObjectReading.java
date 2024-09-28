package apps;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import entities.Employee;

public class ObjectReading {

	public static void main(String[] args) throws Exception
	{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/mydata/emps.dat"));
		//not instantiated with new
		Object obj = ois.readObject();
		if(obj instanceof Employee)
			System.out.println((Employee)obj);

	}

}
