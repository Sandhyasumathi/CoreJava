package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Initially not a part of collection then it has been added to List interface and Will also come under Ennumeration
 */
public class LaunchVector {

	public static void main(String[] args) {
		
		Vector v =new Vector();
		v.addElement(100);
		v.add(1);
		v.add(0, 0);
		v.addLast(150);
		
		System.out.println(v);
		
		Iterator itr = v.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("********************************");

		/**
		 * Iterator from Ennumeration Class
		 */
		 Enumeration vtr = v.elements();
		 
		 while(vtr.hasMoreElements()) {
			 System.out.println(vtr.nextElement());
		 }
	}

}
