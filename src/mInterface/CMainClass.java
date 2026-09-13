package mInterface;

public class CMainClass {

	public static void main(String[] args) {
		
		AVehicle v1 = new BTiago();
		v1.speed();
		System.out.println(AVehicle.compnyName);
		
		System.out.println();
		System.out.println("==================== Multiple Inheritance using Interfaces Example ====================");
		System.out.println();
		
		FImplementation i1 = new FImplementation();
		i1.m1();
		DI1 i2 = new FImplementation();
		i2.m1();
		EI2 i3 = new FImplementation();
		i3.m1();

	}

}
