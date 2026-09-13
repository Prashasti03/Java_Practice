package nExceptionHandling;

import java.util.Scanner;

public class BArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index : ");
		int index = sc.nextInt();
		try {
		System.out.println(arr[index]);
		}
		catch(Exception e) {
			System.out.println("Array index should not exceed 3.");
		}

	}

}
