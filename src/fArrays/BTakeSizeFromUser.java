package fArrays;

import java.util.Scanner;

public class BTakeSizeFromUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element "+(i+1)+" : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
