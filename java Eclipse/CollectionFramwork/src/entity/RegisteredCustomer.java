package entity;


public class RegisteredCustomer extends Customer {
	
	
	private int regNo;

	public RegisteredCustomer(String name, String emailId, int contactno,int regNo) {
		super(name, emailId, contactno);
		this.regNo = regNo;
	}
	@Override
	public String toString() {
		return "RegisteredCustomer [regNo=" + regNo + super.toString()+"]";
	}

	

}