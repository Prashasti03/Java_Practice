package oCollectionsFramework;

import java.util.Stack;

public class CStack {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(23);
		s.push(45);
		s.push(56);
		System.out.println(s);
		System.out.println(s.peek());
		
//		Integer i = new Integer(10);  // The constructor Integer(int) has been deprecated since version 9 and marked for removal
		

	}

}
