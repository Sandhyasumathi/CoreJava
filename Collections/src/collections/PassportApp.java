/**
 * 
 */
package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Passport{
	
	private String name;
	private String city;
	private String country;
	public Passport(String name, String city, String country) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Passport [name=" + name + ", city=" + city + ", country=" + country + "]";
	}
	
}
public class PassportApp {


	public static void main(String[] args) {
		
		HashMap<Integer,Passport> map = new HashMap<>();
		
		map.put(101, new Passport("Name1","City1","Country1"));
		map.put(201, new Passport("Name2","City2","Country2"));
		map.put(301, new Passport("Name3","City3","Country3"));
		map.put(401, new Passport("Name4","City4","Country4"));
		
		Iterator pair = map.entrySet().iterator();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly enter the passport number " );
		Integer userIn = sc.nextInt();
		
		boolean flag = false;
		
		while(pair.hasNext()) {
			Map.Entry  entry = (Entry) pair.next();
			if(userIn.equals(entry.getKey())) {
				System.out.println("Below are your passport details");
				System.out.println(entry.getValue());
				flag=true;
			}	
		}
		if(flag==false) {
			System.out.println("Invalid passport number");
		}

	}

}
