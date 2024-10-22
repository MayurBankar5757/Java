package demo;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

import entity.Customer;
import entity.RegisteredCustomer;

public class CustomerDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		Customer[] c = new Customer[5];

		String name = "";
		String emailId;
		int contactno;
		int regNo;

		System.out.println("Enter the data of customer");

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter c- for customer or  r for register Customer");
			
			String data = br.readLine();
			System.out.println(data);
			if(data.equals("c")) {
			name = br.readLine();
			emailId = br.readLine();
			contactno = Integer.parseInt(br.readLine());

			c[i] = new Customer(name, emailId, contactno);
			}
			else if(data.equals("r")) {
				name = br.readLine();
				emailId = br.readLine();
				contactno = Integer.parseInt(br.readLine());
				regNo = Integer.parseInt(br.readLine());

				c[i] = new RegisteredCustomer(name, emailId, contactno,regNo);
			}

		}
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\know-it\\javatext.txt"));

	
		for (int i = 0; i < 5; i++) {

			
			System.out.println(c[i]);
			oos.writeObject(c[i]);
			
		}

	}

}
