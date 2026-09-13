package fArrays;

import java.util.Scanner;

public class CVowelsInCharArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of characters : ");
		int size = sc.nextInt();
		char arr[] = new char[size];
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter char "+(i+1)+" : ");
			arr[i] = sc.next().charAt(0);
		}
		System.out.println("Vowels in the array are : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || 
					arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U') {
				System.out.println(arr[i]);
			}
		}

	}

}
