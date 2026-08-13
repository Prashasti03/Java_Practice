
public class DDecisionMakingStatements {
//	if
//	if else
//	if else ladder
//	switch
//	Q - what is the use of Scanner class?
//	Scanner is used for desktop applications, where forms are not there, e.g. calculator
	
//	Q Is Java 100% object oriented?
//	no, it uses primitive data types, with static keywords you can call class members without using objects, also main method can be 
//	called without using objects 

	public static void main(String[] args) {
		
		int a = 11;
		
//		Even Odd
		if(a%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
		
		if(a>10) {
			System.out.println("Hello");
		}else if(a<10) {
			System.out.println("Bye");
		}else {
			System.out.println("Number is 10 wrong input");
		}
		
//		Grading program
		double marks = 96;
		
		if(marks>=90 && marks<=100) {
			System.out.println("A+");
		}else if(marks>=80) {
			System.out.println("Grade A");
		}else if(marks>=70) {
			System.out.println("Grade B");
		}else if(marks>=60) {
			System.out.println("Grade C");
		}else if(marks>=50) {
			System.out.println("Grade D");
		}else if(marks>=0) {
			System.out.println("Fail");
		}else {
			System.out.println("Marks must be between 0 to 100. Wrong Input");
		}
		
//		switch case
		int day = 1;
		switch(day) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Input");
		
		}

//		what happens if we write default case in the middle of switch case?
//		what if we don't write break after switch case?
//		what if we don't write break in any case? 
//		Ans - this is known as fall through behaviour
		
		char ch = 'p';
		
		switch(ch) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Invalid input");
//			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
//		default:
//			System.out.println("Consonent");
		}
	}
}
