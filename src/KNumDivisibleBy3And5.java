
public class KNumDivisibleBy3And5 {

	public static void main(String[] args) {
		
		int num = 30;
		
		if(num%3==0 && num%5==0) {
			System.out.println("Number is divisible by both 3 and 5");
		}else {
			System.out.println("Number is NOT divisible by both 3 and 5");
		}
	}
}
