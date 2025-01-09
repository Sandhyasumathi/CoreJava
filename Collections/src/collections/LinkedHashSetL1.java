package collections;

import java.util.LinkedHashSet;


/**
 * Is a child class of HashSet
 * Order of Insertion is preserved
 * Follows Hashing Algorithm for storing the data
 */
public class LinkedHashSetL1 {

	public static void main(String[] args) {

		LinkedHashSet lh = new LinkedHashSet<>();
		
		lh.add(100);
		lh.add(50);
		lh.addFirst(1);
		lh.addLast(10);
		
		System.out.println(lh);
	}

}
