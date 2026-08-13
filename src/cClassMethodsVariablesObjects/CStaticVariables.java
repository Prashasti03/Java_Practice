package cClassMethodsVariablesObjects;

public class CStaticVariables {
	
	static String schoolName;
	int roll_no;

	public static void main(String[] args) {
		CStaticVariables.schoolName = "DPS";
//		schoolName = "DPS";   // this is also correct if used in same class but not advisable, as it creates confusion and may cause errors
		CStaticVariables obj = new CStaticVariables();
		obj.roll_no = 01;
		CStaticVariables obj1 = new CStaticVariables();
		obj1.roll_no = 02;

	}

}

//public class Run {
//	  static String schoolName;
//	    int rollNO;
//	  
//	    
//
//
//
//
//
//
//	  public static void main(String[] args) {
//	      
//	     Run.schoolName="DPS";
//	 
//	  Run obj1=new Run();
//	  Run obj2=new Run();
//	  obj1.rollNO=55;
//	  obj2.rollNO=56;
//	  
//
//	      
//	    }
//	  
//	  
//	  
//	  }
