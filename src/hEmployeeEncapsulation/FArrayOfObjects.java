package hEmployeeEncapsulation;

import java.util.Arrays;

public class FArrayOfObjects {
	int rollno;
	String name;
	
	public FArrayOfObjects(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public static void main(String[] args) {
		FArrayOfObjects s1 = new FArrayOfObjects(101, "Aman");
		FArrayOfObjects s2 = new FArrayOfObjects(102, "Rahul");
		FArrayOfObjects s3 = new FArrayOfObjects(103, "Amit");
		
		FArrayOfObjects arr[] = {s1, s2, s3};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].rollno+" "+arr[i].name);
		}

	}

}
