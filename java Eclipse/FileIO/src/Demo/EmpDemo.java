package Demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import fileIO.Emp;

public class EmpDemo {
	public static void main(String []args) throws Exception {
		

		Emp [] emp = new Emp[2];
		
		emp[0] = new Emp(01,"suraj",11,11,2000,23);
		
		emp[1] = new Emp(02,"aniket",12,12,2012,23);
		

		
		try  {
//			ObjectOutputStream oos1 = new ObjectOutputStream(new FileIutputStream("D:\\know-it\\java.dat"));
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\know-it\\java.dat"));
//			for(Emp e:emp) {
//				
//				oos.writeObject(e);
//			}
			oos.writeObject(emp);
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
