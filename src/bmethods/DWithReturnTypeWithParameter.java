package bmethods;

public class DWithReturnTypeWithParameter {
	
	public int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public String display(String name) {
		return "Hii "+ name;
	}
	
	public int multiply(int a, int b) {
		int result = a*b;
		return result;
	}
	
	public int square(int num) {
		int res= num*num;
		return res;
	}
	
	public int findMax(int a, int b) {
		if(a>b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) {

	}

}
