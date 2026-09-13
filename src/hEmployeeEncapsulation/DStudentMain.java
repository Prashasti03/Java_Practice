package hEmployeeEncapsulation;

public class DStudentMain {

	public static void main(String[] args) {
		
		CStudent s1 = new CStudent();
		
		s1.setName("Ayush");
		s1.setRoll_no(101);
		s1.setAddress("Katraj");
		System.out.println("Roll No : "+s1.getRoll_no());
		System.out.println("Name : "+s1.getName());
		System.out.println("Address : "+s1.getAddress());

	}

}
