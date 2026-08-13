package eScannerClass;

import java.util.Scanner;

public class CStudentMarks {
	
	public String name;
	public double math_marks;
	public double science_marks;
	public double english_marks;
	public double total_marks;
	public double percentage;
	
	public CStudentMarks(String name, double math_marks, double science_marks, double english_marks) {
		this.name = name;
		this.math_marks = math_marks;
		this.science_marks = science_marks;
		this.english_marks = english_marks;
	}
	
	public double totalMarks() {
		total_marks = math_marks + science_marks + english_marks;
		return total_marks;
	}
	
	public double calculatePercentage() {
		percentage = total_marks/3;
		return percentage;
	}
	
	public void display() {
		System.out.println("Student Name : "+name);
		System.out.println("Total Marks : "+total_marks);
		System.out.println("Percentage : "+percentage+"%");
		System.out.println(" ");
		System.out.println("=====================================");
		System.out.println(" ");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Math marks : ");
		double math_marks = sc.nextDouble();
		
		System.out.println("Enter Science marks : ");
		double science_marks = sc.nextDouble();
		
		System.out.println("Enter English marks : ");
		double english_marks = sc.nextDouble();
		
		sc.nextLine();
		
		CStudentMarks s1 = new CStudentMarks(name, math_marks, science_marks, english_marks);
		s1.totalMarks();
		s1.calculatePercentage();
		s1.display();
		
		System.out.println("Enter your name : ");
		String name2 = sc.nextLine();
		
		System.out.println("Enter Math marks : ");
		double math_marks2 = sc.nextDouble();
		
		System.out.println("Enter Science marks : ");
		double science_marks2 = sc.nextDouble();
		
		System.out.println("Enter English marks : ");
		double english_marks2 = sc.nextDouble();
		
		sc.nextLine();
		
		CStudentMarks s2 = new CStudentMarks(name2, math_marks2, science_marks2, english_marks2);
		s2.totalMarks();
		s2.calculatePercentage();
		s2.display();

	}

}
