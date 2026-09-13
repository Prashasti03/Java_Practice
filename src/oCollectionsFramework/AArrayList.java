package oCollectionsFramework;

//Wrapper class - converts primitive datatype into corresponding object
//used to encapsulate primitive datatypes with objects
//bcz. primitive datatypes cannot deal with null, but when working in real projects
//we may need to store null in primitive datatypes as well, for that we use wrapper classes

//Integer i = 10;
//internally -> Integer i = Integer.valueOf(10);  -> this is auto boxing

//auto unboxing - conversion of a wrapper class object (like Integer) into its corresponding primitive type (like int) 
//by the compiler.
//Behind the scenes: The compiler automatically inserts methods like intValue(), doubleValue(), or booleanValue() 
//depending on the data type.

//Autoboxing
//Integer wrapperObj = 5; 

//Auto unboxing
//int primitiveVal = wrapperObj; // Compiler changes this to wrapperObj.intValue()

//Common scenarios: It happens when you assign a wrapper object to a primitive variable, pass an object to a method 
//expecting a primitive, or use wrapper objects in math operations.

//collections work on objects only i.e. Integer, Float and not on int, float etc.

//Collection - represents group of objects as a single entity.
//Collection Framework - contains 9 interfaces.
//1. Collection(I)
//2. List(I)
//3. Set(I)
//4. SortedSet(I)
//5. NavigableSet(I)
//6. Queue(I)
//7. Map(I)
//8. SortedMap(I)
//9. NavigableMap(I)

//Methods present in Collection (I):
//1. boolean add(object o);
//2. boolean addAll(Collection c);
//3. remove(object c);
//4. removeAll(Collection c);
//5. contains(object o);
//6. isEmpty();
//7. size();
//8. Object[] toarray();
//9. Iterator iterator();

//    Collection(I)
//         |
//     ---------------------
//    |         |          |
// List(I)    Set(I)     Map(I)


//                 Collection (I)
//                        |
//                      List(I)
//                        |
//    -----------------------------------------
//    |                   |                   |
//ArrayList(c)       LinkedList(c)          Vector(c)
//                                            |
//                                         Stack(c)

// LinkedList - Doubly Linked List
// ArrayList - Resizable array

//List(I) methods :
//1. add(index i, object o)
//2. addAll(index i, Collection c)
//3. Object get(index i)
//4. Object remove(index i)
//5. Object set(index i, newObject o)
//6. indexOf(Object o)
//7. ListIterator listIterator()

//ArrayList() - default size is 10
//stores elements continuous memory location
//when array elements increase from 10, it searches for another bigger memory space
//generally after java 8 it increases size by 50%, i.e. if the size was 10, then the new size will be 15
//but it depends on the java version
//then copy pastes the whole array to new memory location
//Problem - insertion deletion in between takes time as every element needs to be shifted
//Problem - 1. time taking, 2. if contiguous memory location not found, then it will throw error 

//Properties of ArrayList
//1. Present in Util package
//2. Duplicate allowed
//3. Insertion order is preserved via index
//4. heterogeneous objects allowed
//5. null insertion allowed

import java.util.ArrayList;

public class AArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
//		ArrayList al = new ArrayList();
		al.add(10);
		al.add(22);
		al.add(10);
		al.add(null);
//		al.add("Sajiri");
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		System.out.println(al.contains(22));
		System.out.println(al.isEmpty());
		System.out.println(al.get(2));

	}

}
