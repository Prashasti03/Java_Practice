package nExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ETypesToPrintExceptionStack {

//	public static void main(String[] args) throws FileNotFoundException {
//		
//		FileReader f = new FileReader("abc.txt");
//
//	}
	
	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("==============");
			System.out.println(e.getMessage());
			System.out.println("================");
			System.out.println(e);
		}
	}

}
