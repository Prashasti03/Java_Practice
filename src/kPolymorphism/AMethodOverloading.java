package kPolymorphism;

public class AMethodOverloading {
	
//	case 1 - different parameter list
	
	public void add(int a, int b) {
		System.out.println("int...int");
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println("int...int...int - Different parameter list");
		System.out.println(a+b+c);
	}
	
//	case 2 - different parameter dt
	
	public void add(int a, float b) {
		System.out.println("int...float - different parameter data type");
		System.out.println(a+b);
	}
	
//	case 3 - different in order of paramters
	
	public void add(float a, int b) {
		System.out.println("float...int - different order of parameters");
		System.out.println(a+b);
	}

}
