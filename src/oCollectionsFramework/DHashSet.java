package oCollectionsFramework;

//               Set(I)
//                |
//    -------------------------
//    |                       |
// HashSet()            SortedSet(I)
//    |                       |
// LinkedHashSet(c)     NavigableSet(I)
//                            |
//                        TreeSet(c)

//hash set - hash table
//hash collision - collision of 2 hash codes, where ever collision occurs, linkedlist is created there, now find out if 
//it is a singly linked list or doubly linked list
//also search about it's retrieval - top to bottom and left to right
//duplicates not allowed
//insertion order not preserved
//Objects inserted as per hash code
//null insertion allowed but for once
//heterogeneous objects allowed
//implements Serializable(I) and Clonable(I)
//underlined data structure is hash table
// study shallow copy and deep copy

import java.util.HashSet;

public class DHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(10);
		h.add(null);
		h.add(16);
		h.add(33);
		
		System.out.println(h);
		
		System.out.println(h.hashCode());

	}

}
