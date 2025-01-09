package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

class Employee {

	private String name;
	private int age;
	private double salary;

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public  double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}

public class Stream1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 6);
		List<String> strlist = Arrays.asList("Zebra", "Cat", "Dog", "Elephant", "Tiger", "Eagle", "timber");

		List<Person> personList = Arrays.asList(new Person("name1", 20), new Person("name2", 30),
				new Person("name3", 30), new Person("name4", 40));

		List<Employee> empList = Arrays.asList(new Employee("Name1", 30, 40000), new Employee("Name2", 25, 20000),
				new Employee("Name3", 35, 45000), new Employee("Name4", 33, 38000), new Employee("Name5", 22, 18000),
				new Employee("Name6", 28, 29000));

//		// Write a program to filter even numbers from a list of integers using Streams.
//		List<Integer> eList = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
//		System.out.println(eList);
//
//		//splitting even & odd in same code
//		Map<Boolean, List<Integer>> results = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
//
//		for (Map.Entry<Boolean, List<Integer>> result : results.entrySet()) {
//			if (result.getKey() == true) {
//				System.out.println("Even List - " + result.getValue());
//			} else {
//				System.out.println("Odd List - " + result.getValue());
//			}
//		}
//		
//		//Given a list of strings, convert all strings to uppercase using Streams.
//		System.out.println(strlist.stream().map(e->e.toUpperCase()).collect(Collectors.toList()));
//		
//		
//        //Find the sum of all integers in a list using Streams.
//		System.out.println(list.stream().mapToInt(Integer::intValue).sum());
//		
//		//Given a list of integers, find the maximum and minimum numbers using Streams.
//		System.out.println("Minimum value : " + list.stream().sorted((a,b) -> a.compareTo(b)).findFirst().get());
//		System.out.println("Maximum value : " + list.stream().sorted((a,b) -> b.compareTo(a)).findFirst().get());
//		
//		//Sort a list of strings in ascending and descending order using Streams.
//	     strlist.stream().sorted((a,b) -> a.compareTo(b)).forEach(e->System.out.println(e));
//	     
//	     //Remove duplicate elements from a list of integers using Streams.
//	     System.out.println(list.stream().collect(Collectors.toSet()));

		// Count the number of strings starting with a particular letter in a list using
		// Streams.
//	     System.out.println(strlist.stream().map(e->e.toLowerCase()).filter(e->e.startsWith("t")).count());

		// Given a list of Person objects (with attributes name and age), group them by
		// age using & count by age
//		System.out.println(personList.stream().collect(Collectors.groupingBy(e -> e.getAge(), Collectors.counting())));
//
//		// Find the average of a list of integers using Streams.
//		System.out.println(list.stream().mapToInt(Integer::intValue).average().getAsDouble());
//
//		// Given a list of strings, concatenate them into a single string separated by
//		// commas using
//		System.out.println(strlist.stream().collect(Collectors.joining(",")));
//
//		// filter person age greater than 25
//		personList.stream().filter(e -> e.getAge() > 30).forEach(System.out::println);
//		
//        //Find the top 3 highest salaries from a list of Employee objects
//		
//		empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);
//		
		//Convert a list of Person objects to a list of their names using Streams.
		System.out.println(personList.stream().map(e->e.getName()).collect(Collectors.toList()));
		
		//Find the longest string in a list using Streams
		System.out.println(strlist.stream().map(e->e.length()).sorted((a,b)->b.compareTo(a)).findFirst().get());
		
		System.out.println(strlist.stream().collect(Collectors.groupingBy(e->e.length())));
		
		//Given a list of words, count the frequency of each word and display the results.
		
		Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
		
		
		
		
		

	}

}
