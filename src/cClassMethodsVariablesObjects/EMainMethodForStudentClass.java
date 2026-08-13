package cClassMethodsVariablesObjects;

public class EMainMethodForStudentClass {

	public static void main(String[] args) {
		AStudent s1=new AStudent();
        s1.rollNo=101;
        s1.name="Rushi";
        
        AStudent s2=new AStudent();
        s2.rollNo=102;
        s2.name="Yugma";
        
        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println("-----");
        System.out.println(s2.rollNo);
        System.out.println(s2.name);
        
        System.out.println(s1);
        
        System.out.println("-------------");
        
        s1.m1();
        s1.m2(10, 20);
        int d=  s1.m3();
        System.out.println(d);
        int s=  s1.m4(190);
        System.out.println(s);

	}

}
