package mInterface;

public class FImplementation implements DI1,EI2{

	@Override
	public void m1() {

		System.out.println("Both m1 methods of DI and EI interfaces will have same implementation");
		System.out.println("This is how we can implement multiple inheritance using interfaces");
		
	}

}
