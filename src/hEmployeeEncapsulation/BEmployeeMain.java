package hEmployeeEncapsulation;

public class BEmployeeMain {

	public static void main(String[] args) {
		AEmployee e1 = new AEmployee();
		e1.setId(101);
		e1.setCompanyName("HCLTech");
		System.out.println("ID : "+e1.getId());
		System.out.println("Company Name : "+e1.getCompanyName());

	}

}
