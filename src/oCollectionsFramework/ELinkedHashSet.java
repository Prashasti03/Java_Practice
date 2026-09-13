package oCollectionsFramework;

import java.util.LinkedHashSet;

// used in cache mechanism/ history retrieval
// underlined data structure is hash table and linkedList
// duplicates not allowed, but insertion order is preserved
// output sequence is maintained

public class ELinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> h = new LinkedHashSet<String>();
		
		h.add("Sajiri");
		h.add("Samay");
		h.add("Gayatri");
		h.add(null);
		
		System.out.println(h);

	}

}
