package hEmployeeEncapsulation;

public class EDefaultValues {
	int integer;
	String str;
	boolean bool;
	float flt;
	double dbl;
	long lng;
	short shrt;
	char ch;
	byte bt;

	public static void main(String[] args) {
		
		EDefaultValues d1 = new EDefaultValues();
		System.out.println("Byte : "+d1.bt);
		System.out.println("Integer : "+d1.integer);
		System.out.println("Short : "+d1.shrt);
		System.out.println("Long : "+d1.lng);
		System.out.println("Float : "+d1.flt);
		System.out.println("Double : "+d1.dbl);
		System.out.println("Boolean : "+d1.bool);
		System.out.println("Character : "+d1.ch);
		System.out.println("String : "+d1.str);  // default value of objects is always null

	}

}
