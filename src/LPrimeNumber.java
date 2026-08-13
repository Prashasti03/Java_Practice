
public class LPrimeNumber {

	public static void main(String[] args) {
		
		int num = 31;
		boolean flag = true;
		for(int i=2; i<num; i++ ) {
			if(num%i==0) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is NOT a prime number");
		}
	}
}
