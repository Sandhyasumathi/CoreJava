package collections;

import java.util.LinkedList;

/**
 * LinkedList will implement List and Dequeue
 * It follows Doubly LinkedList DS
 */
public class LinkedListL1 {

	public static void main(String[] args) {
		
		/**
		 * Index based operations are allowed(And it is efficient as well)
		 * Order of insertion is preserved
		 * duplicates are allowed
		 */
		LinkedList ll = new LinkedList();
		
		ll.add("String");
		ll.add(10);
		ll.add(55);
		ll.add(3, 33);
		ll.addFirst(1);
		ll.addLast(3);
		ll.offerFirst(2);
		ll.offerLast(0);
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll);
	}

}
