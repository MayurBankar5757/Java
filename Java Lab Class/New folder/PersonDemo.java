package apps;

import office.utility.Person;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.display();
		
		Person p2 = new Person("Bakul",12,11,1999);
		p2.display();

	}

}
