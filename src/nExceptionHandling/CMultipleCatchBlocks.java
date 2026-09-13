package nExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CMultipleCatchBlocks {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numerator : ");
		int num = sc.nextInt();
		
		System.out.println("Enter the denominator : ");
		int den = sc.nextInt();
		
		try {
			System.out.println("Division is : "+(num/den));
			FileReader f =new FileReader("abc.txt");
		}
//		catch(Exception e) {
//			System.out.println("Some error occurred");
//			System.out.println(e);
//		}  //ERROR - Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
		catch(ArithmeticException e) {
			System.out.println("Denominator cannot be zero.");
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch(Exception e) {
			System.out.println("Some error occurred");
			System.out.println(e);
		}


	}

}
