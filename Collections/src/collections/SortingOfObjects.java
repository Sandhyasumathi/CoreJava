package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * For sorting the objects we have Comparable and Comparator interfaces
 */
class Cricketer {

	private int age;
	private String name;
	private double avg;

	public Cricketer(int age, String name, double avg) {
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
}

/**
 * Comparator is an interface which has compare method which accepts two objects
 * as input we can implement the Comparator method using anonymous inner class ,
 * lambda expression or by implementing it in a separate class
 */
class Comapare implements Comparator<Cricketer> {

	@Override
	public int compare(Cricketer o1, Cricketer o2) {

		/*
		 * We can provide implementation on which basis the given list needs to be
		 * sorted
		 */
		if (o1.getAvg() > o2.getAvg()) {
			return 1;
		}
		return -1;
	}
}

public class SortingOfObjects {

	public static void main(String[] args) {

		Cricketer c1 = new Cricketer(30, "Name1", 80.0);
		Cricketer c2 = new Cricketer(32, "Name2", 90.9);
		Cricketer c3 = new Cricketer(45, "Name3", 79.6);
		Cricketer c4 = new Cricketer(29, "Name4", 60.1);

		/**
		 * By using anonymous inner class
		 */
		Comparator cc = new Comparator<Cricketer>() {

			@Override
			public int compare(Cricketer o1, Cricketer o2) {
				if (o1.getAvg() > o2.getAvg()) {
					return 1;
				}
				return -1;
			}

		};

		/**
		 * Also by using Lambda Expression if we have only one abstract method then
		 * using lambda expresions are the best way
		 */

		Comparator<Cricketer> cc1 = (Cricketer o1, Cricketer o2) -> {
			if (o1.getAvg() > o2.getAvg()) {
				return 1;
			}
			return -1;
		};

		List<Cricketer> c = new ArrayList<>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);

//		Comapare cc = new Comapare();
		System.out.println(c);
		Collections.sort(c, cc1);

		System.out.println(c);

	}

}
