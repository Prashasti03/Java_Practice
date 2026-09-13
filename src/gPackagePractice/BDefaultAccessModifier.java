package gPackagePractice;

// accessed within the same package

public class BDefaultAccessModifier {

	public static void main(String[] args) {
		PrivateDataMembers d1 = new PrivateDataMembers();
		d1.roll_no = 28;
		System.out.println("roll no : "+d1.roll_no);
	}

}
