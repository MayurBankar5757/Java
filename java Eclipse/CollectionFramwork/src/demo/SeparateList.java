package demo;


import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import entity.Customer;
import entity.RegisteredCustomer;

public class SeparateList {

	public static void main(String[]args) {
		
		ObjectInputStream ois =null;
		
		List <Customer> customer = new ArrayList<> ();
		List <RegisteredCustomer> register = new ArrayList<>();
		
		
		try {
		
		ois = new ObjectInputStream(new FileInputStream("D:\\know-it\\javatext.txt"));
		
		Object obj = ois.readObject();
		
		for(int i=0; i<5; i++) {
			
			
			if( obj instanceof RegisteredCustomer) {
				
				register.add((RegisteredCustomer) obj);
			}
			else if(obj instanceof Customer) {
				
				customer.add((Customer) obj);
				
			}
			}
		System.out.println("Customer Data : ");
		System.out.println(customer);
		
		System.out.println("**************");
		System.out.println("Register Data : ");
		System.out.println(register);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
