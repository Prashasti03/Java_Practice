package cClassMethodsVariablesObjects;

public class DStaticMethods {
	
	public static void m1() {
		System.out.println("no return type, no parameters");
	}
	
	public static String m2() {
		return "with return type, without parameter";
	}
	
	public static void m3(String sentence) {
		System.out.println(sentence);
	}
	
	public static String m4(String sentence) {
		return sentence;
	}

	public static void main(String[] args) {
		DStaticMethods obj = new DStaticMethods();
		DStaticMethods.m1();
		System.out.println(DStaticMethods.m2());
		
		DStaticMethods.m3("One parameter, no return type");
		
		String var1 = DStaticMethods.m4("One return type,one paramter");
		System.out.println(var1);
		

		

	}

}


//public class Run {
//	  
//	  
//    
//	 public static void m1() {
//	     System.out.println("hello");
//	 }
//
//
//
//
//
//	  public static void main(String[] args) {
//	      
//	   
//	  Run.m1();
//
//	      
//	    }
//	  
//	  
//	  
//	  }
