//questions

//1. when no access modifier is mentioned, which access modifier is used in data members? : ans - default access modifier
//2. what is the scope of default access modifier? - within the same package
//3. when static keyword is not used, then which kind of variable is created inside class but outside any method? - 
// ans - instance variable
// 4. how can we assign value to instance variables? - using objects
//5. how many copies of instance variables are created? - as many objects are created
//6. no constructor is created, which constructor is there? and who provides that constructor? - default constructor 
//provided by JVM
//7. when we create a parameterized constructor, but do not pass value at the time of object creation, why it gives error?
//ans - bcz. when we create user defined constructor, jvm removes it's default constructor, but if we do not pass values 
//during object creation, JVM searches for its default constructor, which it cannot find, therefore it gives errors

public class ADemo {

	public static void main(String[] args) {
		System.out.print("Prashasti ");
		System.out.print("Dhanorkar");
	}

}
