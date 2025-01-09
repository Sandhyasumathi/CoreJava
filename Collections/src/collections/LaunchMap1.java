package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

/**
 * Map is used to store collection of data as key value pair
 * It will not come under Collection Family
 * It is an Interface which has 2 implementing classes HashMap and HashTable
 */
public class LaunchMap1 {

	public static void main(String[] args) {
		/**
		 * Duplicate keys are not allowed but duplicate values are allowed
		 * null key and values are allowed
		 */
		HashMap<Integer,String> map = new HashMap();
		
		map.put(9, "Java");
		map.put(1, "Spring");
		map.put(7, "Hibernate");
		map.put(null, "Microservices");
		map.put(4, "Microservices");
		map.put(5, null);
		
		System.out.println(map);
		
		System.out.println("**************************");
		
		/**
		 * Duplicate keys are not allowed but duplicate values are allowed
		 * null key and values are not allowed will lead to null pointer Exception
		 */
		Hashtable<Integer,String> map2 = new Hashtable();
		
		map2.put(1, "Java");
		map2.put(1, "Spring");
		map2.put(3, "Hibernate");
		//map2.put(null, "Microservices");
		map2.put(4, "Microservices");
		//map2.put(5, null);
		
		System.out.println(map2);
		
		System.out.println("**************************");
		/**
		 * Duplicate keys are not allowed but duplicate values are allowed
		 * null key and values are allowed
		 * order of insertion is preserved
		 * child of HashMap
		 */
		LinkedHashMap<Integer, String> map3 = new LinkedHashMap<>();
		map3.put(9, "Java");
		map3.put(1, "Spring");
		map3.put(7, "Hibernate");
		map3.put(null, "Microservices");
		map3.put(4, "Microservices");
		map3.put(5, null);
		map3.put(6, null);
		
		System.out.println(map3);
	}

}
