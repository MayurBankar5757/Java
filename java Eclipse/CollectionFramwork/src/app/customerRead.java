package app;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import entity.Customer;
import entity.RegisteredCustomer;

public class customerRead {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ObjectInputStream ois=null;
		String path;
		System.out.println("Enter file name=");
		path=br.readLine();
		
		ois=new ObjectInputStream(new FileInputStream(path));
		List<Customer> c=new ArrayList<>();
		List<RegCustomer>r=new ArrayList<>();
		
		while(true)
		{
			try
			{
				Object obj=ois.readObject();
				
				if(obj instanceof RegisteredCustomer)
					r.add((RegisteredCustomer)obj);
				
				else if(obj instanceof Customer)
					c.add((Customer)obj);
				
				
			}
			catch(Exception e)
			{
				break;
			}
		}
		
		for(Customer i:c)
			System.out.println(i);
		
		for(RegCustomer j:r)
			System.out.println(j);
		
		ois.close();
	}

}
