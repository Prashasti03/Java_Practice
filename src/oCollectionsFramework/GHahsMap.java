package oCollectionsFramework;

import java.util.HashMap;

public class GHahsMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Aman");
		hm.put(2, "Sarthak");
		hm.put(3, "Neha");
		
		System.out.println(hm);
		
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsKey(4));
		System.out.println(hm.containsValue("Neha"));
		System.out.println(hm.containsValue("Riya"));
		System.out.println(hm.size());

	}

}
