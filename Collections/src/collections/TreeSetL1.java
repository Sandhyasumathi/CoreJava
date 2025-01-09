package collections;

import java.util.TreeSet;

/**
 * TreeSet Belongs to set family implemets Navigable set which is the child of sorted set which is a child of Set interface
 * and follows Binary search tree DS
 */
public class TreeSetL1 {

	public static void main(String[] args) {
		
		/**
		 * Index Based insertion is not allowed only in the first and last end
		 * order of insertion is not preserved
		 * Sorted order
		 * follows Inorder Traversal
		 * duplicates are not allowed
		 */
		TreeSet ts = new TreeSet();
		
		ts.add(100);
		ts.add(50);
		ts.add(175);
		ts.add(150);
		ts.add(120);
		ts.add(180);

		System.out.println(ts);
	}

}
