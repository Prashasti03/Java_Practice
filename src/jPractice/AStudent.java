package jPractice;

public class AStudent {
	static String college_name = "IMCC";
	public String name;
	public int roll_no;
	public String email;
	public String mobile_no;
	public String degree_name;
	public int year;
	public String address;
	public String gender;
	
	public AStudent(String name, int roll_no, String email, String mobile_no, String degree_name, int year, String address, String gender) {
		this.name = name;
		this.roll_no = roll_no;
		this.email = email;
		this.mobile_no = mobile_no;
		this.degree_name = degree_name;
		this.year = year;
		this.address = address;
		this.gender=gender;
	}
	
	public void display() {
		System.out.println("Student Name : "+name);
		System.out.println("Roll Number : "+roll_no);
		System.out.println("Email : "+email);
		System.out.println("Mobile Number : "+mobile_no);
		System.out.println("Degree Name : "+degree_name);
		System.out.println("Year : "+year);
		System.out.println("Address : "+address);
		System.out.println("Gender : "+gender);
		System.out.println();
		System.out.println("====================================");
		System.out.println();
	}

	public static void main(String[] args) {
		AStudent s1 = new AStudent("Prashasti", 101, "pd@gmail.com", "9876543210", "MCA", 2, "Pimpri", "Female");
		AStudent s2 = new AStudent("Sajiri", 102, "sj@gmail.com", "9876543211", "MBA", 1, "Akurdi", "Female");
		AStudent s3 = new AStudent("Amit", 103, "amit@gmail.com", "9876543212", "BCA", 3, "Andheri", "Male");
		s1.display();
		s2.display();
		s3.display();
	}

}
