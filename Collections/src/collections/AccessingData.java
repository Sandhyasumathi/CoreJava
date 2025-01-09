package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class AccessingData {

	public static void main(String[] args) {

		/**
		 * For accessing the data we can make use of for loop or for each loop But it is
		 * not recommended As for loop will not be able to
		 * restrict the modification of the Collection at the time of traversal
		 */
		ArrayList list = new ArrayList();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			//concurrent modification
			//list.add(45);
		}

		System.out.println(" ");

		for(Object e:list) {
			System.out.print(e + " ");
		}
		
		/**
		 * But when using Iterator it will throw ConcurrentModificationException FailFast Mechanism
		 */
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//list.add(45);
		}
		
		/**
		 * To Make it Fail Safe we can use CopyOnWriteArrayList Collection class 
		 * ConcurrentModificationException will not occur
		 */
		CopyOnWriteArrayList list1 = new CopyOnWriteArrayList();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		list1.add(500);
		
		Iterator itr1 = list1.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			list1.add(45);
		}
		/**
		 * By using List Iterator we can able to iterate based on the index or in reverse
		 */
		ListIterator itr2 = list1.listIterator(list1.size());
		
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
	}

}
