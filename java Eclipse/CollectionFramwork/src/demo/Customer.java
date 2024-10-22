package demo;

public class Customer  {

	private int id;
	private String name;
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	@Override
//	public int hashCode() {
//		int diff=0;
//		
//		
//		
//		return diff;
//		
//	}
	
	

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Customer) {
			Customer c = (Customer) obj;
			if(this.name.equals(c.name)) {
				
				if(this.id ==c.id) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
			
		}
		return false;
		
	}

	@Override
	public int hashCode() {
		return 0;
		//return super.hashCode();
	}
	
	
	

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	
}
