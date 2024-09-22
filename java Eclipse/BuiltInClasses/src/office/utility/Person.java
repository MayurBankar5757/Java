package office.utility;

public class Person {

	private String name;
	Date dob;

	public Person() {

		name = new String("NA");
	}

	public Person(String name, int dd, int mm, int yy) {

		this.name = name;
		dob = new Date(dd, mm, yy);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {

		return name;
	}

	public String toString() {

		return "Name : " +name + dob.toString();
	}

}
