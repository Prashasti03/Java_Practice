package gPackagePractice;

import eScannerClass.BATM;

//Accessed from anywhere

public class CPublicAccessModifier {

	public static void main(String[] args) {
		
		BATM a1= new BATM();
		a1.current_amount = 10000;
		System.out.println("Current Amount : "+a1.current_amount);   // taken from eScannerClass package's BATM.java

	}

}
