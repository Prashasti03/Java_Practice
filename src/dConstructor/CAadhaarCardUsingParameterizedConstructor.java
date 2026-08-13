package dConstructor;

public class CAadhaarCardUsingParameterizedConstructor {
	
	public String name;
	public String DOB;
	public String address;
	public String phone_no;
	public String aadhaar_no;
	
	public CAadhaarCardUsingParameterizedConstructor(String name, String DOB, String address, 
			String phone_no, String aadhaar_no) {
		this.name = name;
		this.DOB = DOB;
		this.address = address;
		this.phone_no = phone_no;
		this.aadhaar_no = aadhaar_no;
	}
	
	public void display() {
		
		System.out.println("Name : "+name);
		System.out.println("DOB : "+DOB);
		System.out.println("Address : "+address);
		System.out.println("Phone Number : "+phone_no);
		System.out.println("Aadhaar Number : "+aadhaar_no);
		System.out.println(" ");
		System.out.println("-----------------------");
		System.out.println(" ");
		
	}

	public static void main(String[] args) {
		
		CAadhaarCardUsingParameterizedConstructor a1 = new CAadhaarCardUsingParameterizedConstructor("Sahil", "22-01-2003", "Pune", "1234567890", "1234 1234 1234");
		a1.display();
		CAadhaarCardUsingParameterizedConstructor a2 = new CAadhaarCardUsingParameterizedConstructor("Sarthak", "22-10-2005", "Mumbai",  "1234567891", "1235 1235 1235");
		a2.display();
		CAadhaarCardUsingParameterizedConstructor a3 = new CAadhaarCardUsingParameterizedConstructor("Sayli", "10-12-2008", "Hyderabad", "1234567892", "1236 1236 1236");
		a3.display();
		CAadhaarCardUsingParameterizedConstructor a4 = new CAadhaarCardUsingParameterizedConstructor("Sangita", "16-08-1996", "Chennai", "1234567893", "1237 1237 1237");
		a4.display();

	}

}
