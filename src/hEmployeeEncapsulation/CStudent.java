package hEmployeeEncapsulation;

public class CStudent {
	private int roll_no;
	private String address;
	private String name;
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		if(roll_no<0) {
			System.out.println("Invalid Roll Number");
		}else {
			this.roll_no = roll_no;
		}
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
