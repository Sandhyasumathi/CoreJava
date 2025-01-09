package collections;

import java.util.ArrayDeque;

/**
 * Belongs to queue and implements Deque interface
 * follows Double Endded Queue where we can add from first and last but index based insertion is not allowed
 * Order of insertion is preserved
 * duplicates are allowed
 */
public class ArrayDequeue {

	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		
		ad.add(100);
		ad.addFirst(1);
        ad.addLast("String");
        
        System.out.println(ad);
	}

}
