package entity;

public class Student {

	private int studId;
	private String name;
	private String city;
	private float percentage;

	public Student(int studId, String name, String city, float percentage) {
		super();
		this.studId = studId;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}

	@Override
	public int hashCode() {

		int cityCode = 0;

		if (this.city.equals("Pune")) {
			cityCode = 10;
		} else if (this.city.equals("Nagpur")) {
			cityCode = 20;
		} else if (this.city.equals("Mumbai")) {
			cityCode = 30;
		}
		return cityCode;
	}

	@Override
	public boolean equals(Object obj) {

		boolean flag = false;

		if (obj instanceof Student) {

			Student s = (Student) obj;

			if (this.studId == s.studId) {

				if (this.name.equals(s.name)) {

					if (this.city.equals(s.name)) {
						
						return true;
					}
				}
			}
		}
		return flag;
	}

	@Override
	public String toString() {

		return "Student [studId=" + studId + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]";
	}

}
