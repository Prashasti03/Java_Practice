
public class GWhileLoop {

	public static void main(String[] args) {
		
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		int num = 1234;
		
		int sum = 0;
		
		for(int j=0; j>=0; j++) {
			int rem = num%10;
			sum= sum+rem;
			num/=10;
		}
		
		System.out.println(sum);

	}

}
