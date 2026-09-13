package oCollectionsFramework;

import java.util.TreeSet;

// underlined data structure is balanced tree.
// duplicates not allowed
// null insertion not allowed. (not even once)
// heterogeneous objects are not allowed.
// Insertion order is as per some sorting order. Ascending/Descending

// methods present in SortedSet(I)
// first()
// last()
// headSet()
// tailSet()
// subSet()

// NavigableSet(I)
// Use: for navigation purpose
// methods :
// floor()
// lower()
// ceiling()
// higher()

public class FTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(23);
		t.add(65);
		t.add(11);
		t.add(25);
		t.add(5);
		
		System.out.println(t);
		
		System.out.println(t.ceiling(30));
		System.out.println(t.ceiling(25));
		System.out.println(t.higher(25));
		System.out.println(t.lower(25));
		

	}

}
