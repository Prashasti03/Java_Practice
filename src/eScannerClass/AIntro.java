package eScannerClass;

import java.util.Scanner;

public class AIntro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount : ");
		int a = sc.nextInt();
		System.out.println("You entered : "+a);
		
		
//		since after typing the number we press enter so system stores \n, this is taken as an input in nextLine()
//		and so we are not able able to enter our name, to avoid this, we have added sc.nextLine() in line no. 18
//		this consumes the \n, and the next nextLine() takes our name
		sc.nextLine();
		
		System.out.println("Enter full name : ");
//		String name = sc.next();  // it only considers characters before space, after space it will move to next line
		String name = sc.nextLine();
		System.out.println("You entered : "+name);
		
		
		System.out.println("Are you hushaar? type true for yes and false for no : ");
		boolean reply = sc.nextBoolean();
		if(reply) {
			System.out.println("You said YES, hehe Gairsamaj");
		}else {
			System.out.println("You said NO, Good atleast you are self aware !! 👍");
		}

	}

}
