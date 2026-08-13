package cClassMethodsVariablesObjects;

public class BAadhaarCard {
	
	public String name;
	public String DOB;
	public String address;
	public String phone_no;
	public String aadhaar_no;
	
	public void display(String name, String DOB, String address, 
			String phone_no, String aadhaar_no) {
		
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
		
		BAadhaarCard a1 = new BAadhaarCard();
		a1.display("Sahil", "22-01-2003", "Pune", "1234567890", "1234 1234 1234");
		
		BAadhaarCard a2 = new BAadhaarCard();
		a2.display("Sarthak", "22-10-2005", "Mumbai",  "1234567891", "1235 1235 1235");
		
		BAadhaarCard a3 = new BAadhaarCard();
		a3.display("Sayli", "10-12-2008", "Hyderabad", "1234567892", "1236 1236 1236");
		
		BAadhaarCard a4 = new BAadhaarCard();
		a4.display("Sangita", "16-08-1996", "Chennai", "1234567893", "1237 1237 1237");

	}

}
