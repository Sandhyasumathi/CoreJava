package collections;

import java.util.HashSet;

/**
 * Belongs to the Set interface and uses Hashing algorithm to store the values
 * Order of insertion is not preserved
 * internally uses HashMap for operations
 * duplicates are not allowed
 */
public class HashSetL1 {

	public static void main(String[] args) {
		
	HashSet set = new HashSet();
		
		set.add(1);
		set.add(2);
		System.out.println(set);

	}

}
