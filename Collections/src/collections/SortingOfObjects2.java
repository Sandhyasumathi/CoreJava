package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparable is one way of perform sorting 
 * It is a Functional interface
 * Has Compare to method with one object as parameter
 * Needs to be implemented on the Target class
 */
class Cricketer1 implements Comparable<Cricketer1>{

	private int age;
	private String name;
	private double avg;

	public Cricketer1(int age, String name, double avg) {
		super();
		this.age = age;
		this.name = name;
		this.avg = avg;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Cricketer [age=" + age + ", name=" + name + ", avg=" + avg + "]";
	}

	@Override
	public int compareTo(Cricketer1 o) {
		if(this.avg>o.avg) {
			return 1;
		}
		return -1;
	}
}

public class SortingOfObjects2 {

	public static void main(String[] args) {
		Cricketer1 c1 = new Cricketer1(30, "Name1", 80.0);
		Cricketer1 c2 = new Cricketer1(32, "Name2", 90.9);
		Cricketer1 c3 = new Cricketer1(45, "Name3", 79.6);
		Cricketer1 c4 = new Cricketer1(29, "Name4", 60.1);

		ArrayList<Cricketer1> c = new ArrayList<>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		System.out.println(c);
		Collections.sort(c);

		System.out.println(c);

	}

}
