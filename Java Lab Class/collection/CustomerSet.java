package demos;

import java.util.HashSet;
import java.util.Set;

import entities.Customer;

public class CustomerSet {

	public static void main(String[] args) {
		Set<Customer> custs = new HashSet<>();
		custs.add(new Customer(101, "XXXX", "Pune"));    //uses hashCode() - adds element in subgroup
		custs.add(new Customer(113, "CCCC", "Mumbai"));
		custs.add(new Customer(176, "YYYY", "Pune"));
		custs.add(new Customer(134, "WWWW", "Nashik"));
		custs.add(new Customer(112, "QQQQ", "Nagpur"));
		custs.add(new Customer(189, "PPPP", "Pune"));
		custs.add(new Customer(123, "KKKK", "Nagpur"));
		custs.add(new Customer(101, "XXXX", "Pune"));
		custs.add(new Customer(106, "SSSS", "Mumbai"));
		custs.add(new Customer(154, "UUUU", "Nagar"));
		custs.add(new Customer(188, "VVVV", "Mumbai"));
		System.out.println(custs.size());
		for(Customer c : custs)
			System.out.println(c);
		
		if(custs.contains(new Customer(106, "SSSS", "Mumbai")))  //hashCode(), equals()
		{
			System.out.println("customer present");
		}
		

	}

}
