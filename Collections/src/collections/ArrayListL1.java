package collections;

import java.util.ArrayList;

/**
 * It belogs to the List family ie it implements List Interface
 * It follows Dynamic Array Data Structure (It will grow and shrink dynamically)
 */
public class ArrayListL1 {

	public static void main(String[] args) {
		
		/**
		 * We can able to add Heterogenous data
		 * Index based operations are allowed(but it is not efficient)
		 * Order of insertion is preserved
		 * duplicates are allowed
		 */
		ArrayList al = new ArrayList();
		
		al.add(100);
        al.add("String");
        al.add(4.5);
        al.add(true);
        System.out.println(al);
        al.add(0, 44);
        System.out.println(al);
	}

}
