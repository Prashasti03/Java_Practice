package qPractice;

import java.util.Scanner;

public class ANumberPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int num1 = num;
		int newNum = 0;
		while(num>0) {
			
			int rem=num%10;
			newNum= newNum*10+rem;
//			System.out.println(newNum);
			num=num/10;
			
		}
		
		if(newNum == num1) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is NOT Palindrome");
		}

	}

}
