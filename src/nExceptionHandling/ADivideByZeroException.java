package nExceptionHandling;

// checked exception - which compiler can assume that it may or may not give an error
// e.g. reading a file, the compiler may assume that file can be cannot be present in the system, 
// therefore this line may or may not give errors/exception
// unchecked exception - every run time exception and it's children are unchecked exceptions
// where errors cannot be assumed


// unchecked exceptions are created by method and JVM, then passed to default exception handler, which passes the exception
import java.util.Scanner;

public class ADivideByZeroException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numerator : ");
		int num = sc.nextInt();
		
		System.out.println("Enter the denominator : ");
		int den = sc.nextInt();
		
		try {
			System.out.println("Division is : "+(num/den));
			System.out.println("Hello Java");
		}
		catch(Exception e) { // this is only a reference and no object is created right now
//			when exception occurs, java creates an object and the method in which the exception occurred provides the 
//			information about the exception to the object, which is then displayed in e.
			System.out.println("Denominator cannot be zero.");
			System.out.println(e);
		}
		finally {  // used for resource cleaning
			System.out.println("Hello World");
			sc.close();
		}

	}

}
