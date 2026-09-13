package fArrays;

import java.util.Scanner;

public class EStoreArrayElesInReverseOrder {

	public static void main(String[] args) {
//		int a[] = {22,44,33,11,55,66};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		for(int i=0; i<a.length;i++) {
			System.out.println("Enter element "+(i+1)+" : ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array elements in reverse order are : ");
		
		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}

	}

}
