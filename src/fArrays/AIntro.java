package fArrays;

public class AIntro {

	public static void main(String[] args) {
		
		int arr[]= {11, 22, 33};
		System.out.println(arr);   // prints address
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("=============================");
		
		
//		print only even elements
		int arr1[] = {33, 44, 22, 11, 55};
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]%2==0) {
				System.out.println(arr1[i]);
			}
		}
		
		System.out.println("=======================");

		
//		sum of elements of an array
		int arr2[] = {33, 66, 99, 11, 23};
		int sum=0;
		for(int i=0; i<arr2.length; i++) {
			sum+=arr2[i];
		}
		
		System.out.println(sum);
		
		System.out.println("==========================");
		
//		multiplication of elements of an array
		int result=1;
		for(int i=0; i<arr2.length; i++) {
			result*=arr2[i];
		}
		
		System.out.println("Multiplcation is : "+result);
	}
}


