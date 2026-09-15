package qPractice;

import java.util.Scanner;

public class DFactorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int fact=1;
		for(int i=2; i<=num; i++) {
			fact *= i;
		}
		
		System.out.println(fact);

	}

}
