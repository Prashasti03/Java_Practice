package kPolymorphism;

public class BMain {

	public static void main(String[] args) {
		
		AMethodOverloading m1 = new AMethodOverloading();
		m1.add(10, 20);
		m1.add(10, 20, 30);
		m1.add(10, 20.6f);
		m1.add(10.8f, 20);
		
		CTrickQuestion q1 = new CTrickQuestion();
		q1.add(null);  // when given null, child is given preference over parent class therefore String is called over Object
		
		System.out.println();
		System.out.println("============ Tiago Example Started ======================");
		System.out.println();
		
		ETiagoAdvance t1 = new ETiagoAdvance();
		t1.speed();
		
		DTiago t2 = new DTiago();
		t2.speed();
		
//		A parent reference can hold a child's object, but the vice-versa is not true
		
		DTiago t3 = new ETiagoAdvance();
		t3.speed();
		
		System.out.println();
		System.out.println("============ Employee Example Started ======================");
		System.out.println();
		
		FEmployee e1 = new FEmployee();
		e1.calculateSalary();
		
		FEmployee e2 = new GFullTimeEmployee();
		e2.calculateSalary();
		
		FEmployee e3 = new HPartTimeEmployee();
		e3.calculateSalary();
		
		System.out.println();
		System.out.println("============ Animal Example Started ======================");
		System.out.println();
		
		IAnimal a1 = new IAnimal();
		a1.sound();
		
		IAnimal a2 = new JDog();
		a2.sound();
		
		IAnimal a3 = new KCat();
		a3.sound();
		
		IAnimal a4 = new LCow();
		a4.sound();

	}

}
