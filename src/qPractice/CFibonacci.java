package qPractice;

import java.util.Scanner;

public class CFibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms : ");
		int n = sc.nextInt();
		
		int first = 0;
		int second = 1;
		
		System.out.print("Fibonacci Series : ");
		
		for(int i=1; i<=n; i++) {
			System.out.print(first+" ");
			int third = first+second;
			first = second;
			second = third;
		}

	}

}
