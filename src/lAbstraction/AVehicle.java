package lAbstraction;

//if the class is abstract it is NOT necessary that it contains abstract method
//if there is one abstract method then the class must be abstract
//we cannot create object of abstract class - bcz on creating object, it calls the body of the method, if the body is not 
//present, what will the object call? therefore we cannot create the object of abstract class
// the class which extends abstract class is responsible to give implementation of abstract class

public abstract class AVehicle {
	 
	public abstract void speed();
	
	public void noOfTyres() {
		System.out.println("4");
	}

}
