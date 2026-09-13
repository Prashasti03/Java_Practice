
public class BDatatypesTypeCasting {
	
//	Keywords
//	datatypes
//	variables
//	type casting - implicit and explicit

	public static void main(String[] args) {
//		byte - range -128 to 127
//		short
//		int
//		long
		byte a = 15;
		short b = 32707;
		int c = 11223345;
		long d = 34567678786765L;  // use L only if the value is out of the range of int otherwise not compulsory
		long u = 10;
		System.out.println("byte a :"+a);
		System.out.println("short b :"+b);
		System.out.println("int c :"+c);
		System.out.println("long d :"+d);
		System.out.println("long without L suffix bcz it is under the int range u :"+u);
//		byte b = 128;  // type mismatch: cannot convert from int to byte
//		System.out.println(b);
		
//		float
//		double
		
		float e = 10.9f;
		double f = 10.9;
		float g = 10;
//		float mun = 10.0;   // type mismatch, cannot convert double to float
		System.out.println("float e :"+e);
		System.out.println("double f :"+f);
		System.out.println("float without f suffix g :"+g);
		
		boolean h = true;
		boolean i = false;
		
		System.out.println("boolean h :"+h);
		
		char j = 'a';
		int k = 'a';
		int l = 'A';
		char m = 92;
		
		System.out.println("Char j :"+ j);
		System.out.println("Int k : "+k);
		System.out.println("int l : "+l);
		System.out.println("char m : "+m);
		
//		String - non-primitive
		String n = "Prashasti";
		System.out.println("String n : "+n);
		
//		type casting (widening - implicit type-casting - small dt to big dt - no data loss)
		
		byte s = 120;
		short t = s;
		System.out.println("Byte converted to short, widening, implicit type casting : "+t);
		
//		type casting (narrowing - explicit type-casting - big dt to small dt - data loss)
		short o = 128;
		byte p = (byte)o;
		System.out.println("short converted to byte, narrowing, explicit type casting : "+p);
		
		short q = -129;
		byte r = (byte)q;
		System.out.println("short converted to byte, narrowing, explicit type casting : "+q);
		
		short v = -122;
		byte w = (byte)v;
		System.out.println("short converted to byte, narrowing, explicit type casting : "+w);
		
		

	}

}
