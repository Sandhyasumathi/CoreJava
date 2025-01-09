package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map Objects can be accessed as key value pair by using entrySet();
 * All the keys alone can be accessed separately by using keySet()
 * All the values alone can be accessed separately by using Values()
 * 
 */
public class AccesingOfMapObjects {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap();
		
		map.put(9, "Java");
		map.put(1, "Spring");
		map.put(7, "Hibernate");
		map.put(null, "Microservices");
		map.put(4, "Microservices");
		map.put(5, null);
		
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		System.out.println(map.entrySet());
		
		/**
		 * Entry in set refers to Key value pair and it is a sub interface of Map
		 * it can be called as Map.Entry
		 */
		 Iterator itr = map.entrySet().iterator();
		 while(itr.hasNext()) {
			 Map.Entry pair = (Entry) itr.next();
			 System.out.println("Key :" + pair.getKey() + " Value: " + pair.getValue());
		 }
         

	}

}
