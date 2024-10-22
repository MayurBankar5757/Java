package entity;

import java.io.Serializable;

public class Customer implements Serializable {

	private String name;
	private String emailId;
	private int contactno;
	
	public Customer(String name, String emailId, int contactno) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.contactno = contactno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", emailId=" + emailId + ", contactno=" + contactno + "]";
	}

	
	
	
}
