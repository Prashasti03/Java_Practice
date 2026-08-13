package dConstructor;

public class BParameterizedConstructor {
	int a;
	int c;
	
	public BParameterizedConstructor(int b, int c) {
		a=b;
		this.c = c;
	}

	public static void main(String[] args) {
		
		BParameterizedConstructor obj = new BParameterizedConstructor(10, 20);
		BParameterizedConstructor obj1 = new BParameterizedConstructor(60, 80);
		System.out.println("a variable of 1st object : "+ obj.a);
		System.out.println("c variable of 1st object : "+obj.c);
		
		System.out.println("a variable of 2nd object : "+ obj1.a);
		System.out.println("c variable of 2nd object : "+obj1.c);
	}

}

//public class Run {
//	  int  a;
//	    
//	  
//	    
//
//	  public Run(int b) {
//	    super();
//	     a = b;
//	}
//
//
//
//
//	  public static void main(String[] args) {
//	      
//	      Run obj=new Run(10);
//	      Run obj1=new Run(99);
//	      
//	      System.out.println(obj.a);
//	      System.out.println(obj1.a);
//	  
//	      
//	    }
//	  
//	  
//	  
//	  }
