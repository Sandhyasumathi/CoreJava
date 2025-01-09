package enumannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * we can also create custom annotations can also define where the annotation
 * can be use by using Target annotation which is one of the meta annotation
 * Retention to specify whether to be in runtime or to get discard in the compile time
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface IndianCricketer {

}

/**
 * Annotations are a meta data that provides additional information about the
 * program to the compiler & runtime
 * 
 * we can create our own annotations
 */
class Player {

	String name;
	int age;

	public Player(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void play() {
		System.out.println("Playing...");
	}
}

@IndianCricketer
class Virat extends Player {

	public Virat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	/**
	 * used for code validation This should be a overriden method but the method
	 * name is not correct if we give @overridden annotation then the error can be
	 * identified by the compiler otherwise the parent method will be called
	 */

	@Override
	public void play() {
		System.out.println("Virat is Playing...");
	}
}

public class LaunchAnnotations {

	public static void main(String[] args) {

	}

}
