package gPackagePractice;

class PrivateDataMembers{
	private String name;
	private int age;
	int roll_no;
	
	
	private void display() {
		System.out.println("Name : "+name);
		System.out.println("Roll no : "+roll_no);
	}
}

// accessed only within the same class

public class APrivateAccessModifier {

	public static void main(String[] args) {
		PrivateDataMembers d1 = new PrivateDataMembers();
//		d1.name = "Ayush";     // ERROR
//		d1.display();     //ERROR
		d1.roll_no = 32;
		System.out.println("roll no : "+d1.roll_no);
		
	}

}
