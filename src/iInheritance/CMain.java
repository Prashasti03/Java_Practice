package iInheritance;

//Multiple inheritance - not possible through java classes, bcz if both parent class have method with the same name, then 
//the child class won't be able to determine from which parent class should it execute the code
//It is possible using interfaces

public class CMain {

	public static void main(String[] args) {
		BCar c1 = new BCar();
		System.out.println("Tyre : "+c1.tyre);
		c1.engineType();
		c1.speed();
//		c1.color = "Red";  // ERROR the filed AVehicle.color is not visible
		AVehicle v1 = new AVehicle();
		DHonda h1 = new DHonda();
		h1.speed();
		h1.engineType();
		h1.sydan();
		
		FDeveloper d1 = new FDeveloper();
		GTester t1 = new GTester();
		HManager m1 = new HManager();
		
		d1.emp();
		d1.dev();
		
		t1.emp();
		t1.test();
		
		m1.emp();
		m1.manager();

	}

}
