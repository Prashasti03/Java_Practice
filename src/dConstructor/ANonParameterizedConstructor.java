package dConstructor;

// first line of any constructor is always super();

public class ANonParameterizedConstructor {
	
	int a;
	int b;
	
	public ANonParameterizedConstructor() {
		a=20;
		System.out.println("Hello");
		System.out.println("a : "+a);
	}

	public static void main(String[] args) {
		
		ANonParameterizedConstructor obj = new ANonParameterizedConstructor();
		obj.b = 30;
		System.out.println("b : "+obj.b);
		
		ANonParameterizedConstructor obj1 = new ANonParameterizedConstructor();
		obj1.b = 60;
		System.out.println("b : "+obj1.b);

	}

}

//public class Run {
//	  int  a;
//	    
//	    public Run() {
//	      System.out.println("hello");
//	    }
//
//	  public static void main(String[] args) {
//	       Run obj=new Run();
//	       Run obj1=new Run();
//	       obj.a=22;
//	       obj1.a=99;
//	  
//	      
//	    }
//	  
//	  
//	  
//	  }
