package apps;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import office.staff.Emp;

public class DeserializationDemo {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("D:/mydata/office.dat"));
			//ois.readObject();
			/*Emp [] emps = new Emp[3];
			for(int i = 0;i<emps.length;i++) {
				 Object obj = ois.readObject();
				 if(obj instanceof Emp)
					 emps[i] = (Emp)obj;
			}*/
			List<Emp> emps = new ArrayList<>();
			while(true) {  //execute till readObject() throws exception
				try {
					emps.add((Emp)ois.readObject());
				}
				catch(Exception e) {
					break;
				}				
			}			
			for(Emp e : emps)
				System.out.println(e);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
