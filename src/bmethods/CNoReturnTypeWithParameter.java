package bmethods;

public class CNoReturnTypeWithParameter {
	
	public void printSum(int a, int b) {
		System.out.println(a+b);
	}
	
	public void displayName(String name) {
		System.out.println("Hello "+name);
	}
	
	public void checkEven(int num) {
		if(num%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

	public static void main(String[] args) {
		
	}

}
