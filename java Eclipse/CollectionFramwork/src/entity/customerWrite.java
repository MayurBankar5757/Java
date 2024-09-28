package app;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Flushable;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

import utility.Customer;
import utility.RegCustomer;

public class customerWrite {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream oos=null;
		String path;
		System.out.println("Enter file name=");
		path=br.readLine();
		oos=new ObjectOutputStream(new FileOutputStream(path)); 
				
		Customer []cust=new Customer[3];
		String nm,em;
		int n;
		long m;
		
		for(int i=0;i<cust.length;i++)
		{
			System.out.println("Enter c if you want customer or r");
			char ch=br.readLine().charAt(0);
			if(ch!='c')
			{
			System.out.println("Enter name=");
			nm=((BufferedReader)br).readLine();
			System.out.println("Enter register number=");
			n=Integer.parseInt(br.readLine());
			System.out.println("Enter email=");
			em=((BufferedReader)br).readLine();
			System.out.println("Enter conatact number=");
			m=Long.parseLong(br.readLine());
			cust[i]=new RegCustomer(nm,em,m,n);
			}
			else
			{
				System.out.println("Enter name=");
				nm=((BufferedReader)br).readLine();
				System.out.println("Enter email=");
				em=((BufferedReader)br).readLine();
				System.out.println("Enter contact number=");
				m=Long.parseLong(br.readLine());
				cust[i]=new Customer(nm,em,m);
			}
		}
		
		for(int i=0;i<cust.length;i++) {
			System.out.println("written");
			oos.writeObject(cust[i]);
		}
		System.out.println("Customer saved in file...");
		oos.close();
	}
}
/*cust[0]=new Customer("Tanu","tanu@123",546738939);
cust[1]=new RegCustomer("vibhav","viabh@123",987873839,101);
cust[2]=new Customer("Mohit","moni@123",887673839);*/