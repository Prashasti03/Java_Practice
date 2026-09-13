package oCollectionsFramework;

import java.util.LinkedList;

public class BLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(11);
		ll.add(22);
		ll.add(33);
		
		System.out.println(ll);
		
		ll.add(1, 9);
		ll.add(2, 33);
		ll.add(null);
		
		System.out.println(ll);

	}

}
